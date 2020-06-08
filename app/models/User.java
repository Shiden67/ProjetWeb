package models;
import java.util.Date;

public class User{
    
    private static final long serialVersionUID = 1L; 
    
    private long id;
    private String prenom;
    private String nom;
    private Date age;
    private String email;
    private String mdp;
    
    
    public User(){
        this.prenom ="";
        this.nom ="";
        this.age = null;
        this.email = "";
        this.mdp = "";
        
         }
    
    
    
     public long getid(){
        
        return this.id;
        
    }
    
    public void setid( long id){
        
        this.id = id;
        
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
        
        
        this.prenom = nom;
        
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
    
    
    // public static Finder<Long , User> find = new Finder<Long,User>(User.class);
    
    
    
}