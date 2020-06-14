package controllers;
import views.html.*;
import java.util.List ; 
import play.mvc.*;
import models.*;
import javax.inject.Inject; 
import play.i18n.MessagesApi;
import play.data.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeControllerUser extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    
    
    @Inject
    FormFactory formFactory;
    Form <User> userForm;
    MessagesApi messagesApi;
    
    @Inject 
    public HomeControllerUser(FormFactory formFactory, MessagesApi messagesApi ){
        
        this.userForm = formFactory.form(User.class);
        this.messagesApi =  messagesApi;
        
        
    }
    
    
    public Result ajoutUser(Http.Request request){
        
        return ok(views.html.ajoutUser.render(userForm,request,messagesApi.preferred(request)));
        
        
        
    }
    
    public Result userOk(Http.Request request){
        
        Form<User> lform = userForm.bindFromRequest(request);
        if (lform.hasErrors()){
            
            return badRequest(views.html.ajoutUser.render(lform , request,messagesApi.preferred(request)));
            
        }
        
        
        else{
        User user = lform.get();
             user.save();
        return redirect(routes.HomeControllerUser.listeUser());
        }
    }
    
    public Result listeUser(){
        
        List<User> liste = User.find.all();
        return ok(listeUser.render(liste));
          
    }
    
    
      public Result rechercheUser( Long id) {
        
        User user = User.find.byId(id);
        return ok (rechercheUser.render(user));
        
        
        
    }
    
    public Result supprimerUser(Long id){
        User user = User.find.byId(id);
        user.delete();
        
        return redirect (routes.HomeControllerUser.listeUser());
        
    }
    
    public Result majUser(Long id , Http.Request request){
        
        User user = User.find.byId(id);
        userForm =userForm.fill(user);
        return ok(majUser.render(userForm, id , request, messagesApi.preferred(request)));
        
        
    }

    public Result majUserOk(Long id , Http.Request request){
        
        Form<User> lform = userForm.bindFromRequest(request);
        if (lform.hasErrors()){
            
            return badRequest(views.html.ajoutUser.render(lform , request,messagesApi.preferred(request)));
            
        }
        
        
        else{
        User user = lform.get();
        user.setidUser(id);
        user.update();
            user.save();
        return redirect(routes.HomeControllerUser.listeUser());
        }
    } 
    
  
    
}
