package controllers;
import views.html.*;
import java.util.List ; 
import play.mvc.*;
import models.*;
import javax.inject.Inject; 
import play.i18n.MessagesApi;
import play.data.*;
import models.User;
import java.util.Date;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    
    
    @Inject
    FormFactory formFactory;
    Form <Produit> produitForm;
    MessagesApi messagesApi;
    
    @Inject 
    public HomeController (FormFactory formFactory, MessagesApi messagesApi ){
        
        this.produitForm = formFactory.form(Produit.class);
        this.messagesApi =  messagesApi;
        
        
    }
    
    public Result acceuil() {
        //Date test = new Date ();
        //long date = test.getTime();
        //Date date2 = new Date(2006 , 6 , 16);
        return ok(views.html.acceuil.render());
    }
    
    public Result ajoutProduit( Http.Request request , Long idUser){
        User user = User.find.byId(idUser);
        return ok(views.html.ajoutProduit.render(user, produitForm,request,messagesApi.preferred(request)) );
        
        
        
    }
    
    public Result produitOk(Http.Request request, Long idUser  ){
        
        
         User user = User.find.byId(idUser);
        Form<Produit> lform = produitForm.bindFromRequest(request);
        if (lform.hasErrors()){
            
            return badRequest(views.html.ajoutProduit.render(user, lform ,   request,messagesApi.preferred(request)));
            
        }
        
        
        else{
        
        Produit produit = lform.get();
            user.add(produit);
            produit.save();
        return redirect(routes.HomeControllerUser.rechercheUser(user.getidUser()));
        }
    }
    
    public Result listeProduit(){
        
        List<Produit> liste = Produit.find.all();
        return ok(listeProduit.render(liste));
          
    }
    
    public Result rechercheProduit( Long id) {
        
        Produit produit = Produit.find.byId(id);
        return ok (rechercheProduit.render(produit));
        
        
        
    }
    
    public Result supprimerProduit(Long id){
         
        Produit produit = Produit.find.byId(id);
        produit.delete();
        
     
             return redirect (routes.HomeController.rechercheProduit(id-1));
            
       
        
    }
    
    public Result majProduit(Long id , Http.Request request){
        
        Produit produit = Produit.find.byId(id);
        produitForm = produitForm.fill(produit);
        return ok(majProduit.render(produitForm, id , request, messagesApi.preferred(request)));
        
        
    }

    public Result majProduitOk(Long id , Http.Request request){
        
        Form<Produit> lform = produitForm.bindFromRequest(request);
        if (lform.hasErrors()){
            
            return badRequest(views.html.majProduit.render(lform , id, request,messagesApi.preferred(request)));
            
        }
        
        
        else{
        Produit produit = lform.get();
        produit.setid(id);
        produit.update();
            produit.save();
                return redirect (routes.HomeController.rechercheProduit(id));
        }
    } 
    
  
    
}
