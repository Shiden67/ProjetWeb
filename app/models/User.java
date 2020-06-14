package models;
import java.util.Date;

import play.data.validation.Constraints.*;

import io.ebean.*;

import javax.persistence.*;
import java.util.List;


@Entity
public class User extends Model{
    
    private static final long serialVersionUID = 1L; 
    @Id
    private long idUser;
   @Required
    private String prenom;
    @Required
    private String nom;
    @Required
    private Date age;
    @Required
    private String email;
    @Required
    private String mdp;
    
    
    public User(){
        this.prenom ="";
        this.nom ="";
        this.age = null;
        this.email = "";
        this.mdp = "";
        
         }
    
    @OneToMany
    public List<Produit> produit;
    
    public boolean add(Produit p){
        
        p.user = this;
        return produit.add(p);
        
        
    }
    
    
     public long getidUser(){
        
        return this.idUser;
        
    }
    
    public void setidUser( long id){
        
        this.idUser = id;
        
    }
    
    public String getprenom(){
        
        return this.prenom;
        
    }
    
    public void setprenom(String prenom){
        
        
        this.prenom = prenom;
        
    }
    
    public String getnom(){
        
        return this.nom;
        
    }
    
    public void setnom(String nom){
        
        
        this.nom = nom;
        
    }
    
    
    public Date getage (){
        
        
        return this.age;
        
        
    }
    
    public void setage(Date age){
        
        
        this.age = age;
    }
    
    
    public String getemail(){
        
        return this.email;
        
    }
    
    public void setemail(String email){
        
        
        this.email = email;
        
    }
    
    public String getmdp(){
        
        return this.mdp;
        
    }
    
    public void setmdp(String mdp){
        
        
        this.mdp = mdp;
        
    }
    
    
    public static Finder<Long , User> find = new Finder<Long,User>(User.class);
    
    
    
}