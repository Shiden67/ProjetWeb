package models;
import java.util.Date;
import play.data.validation.Constraints.*;

import io.ebean.*;
import javax.persistence.*;



@Entity
public class Produit extends Model{

private static final long serialVersionUID = 1L;     
@Id    
private long id;
@Required
private String nomProduit;
@Required
private String familleProduit;
@Required
private String typeProduit;
@Required
@Min(value=1, message = "Vous devez au moins avoir 1 Produit")
private int nmbProduit;
@Required
private Date datePeremption;
    
    public Produit () {
    
    this.nomProduit = "";
    this.familleProduit = "";
    this.typeProduit = "";
    this.nmbProduit = 1;
    this.datePeremption = null;
}
    
    
   @ManyToOne
   public User user;
    
    
    
    
    
    
    
    
    
    public long getid(){
        
        return this.id;
        
    }
    
    public void setid( long id){
        
        this.id = id;
        
    }
    
    public String getnomProduit(){
        
        
        return this.nomProduit;
        
    }
    
    public void setnomProduit (String nomProduit){
        
        this.nomProduit = nomProduit;
        
        
    }
    
    public String getfamilleProduit(){
        
        return this.familleProduit;
        
        
    }
    
    
    public void setfamilleProduit(String familleProduit){
        
        
        this.familleProduit = familleProduit;
        
    }
    
      public String gettypeProduit(){
        
        return this.typeProduit;
        
        
    }
    
    
    public void settypeProduit(String typeProduit){
        
        
        this.typeProduit = typeProduit;
        
    }
    
    public Date getdatePeremption(){
        
        return this.datePeremption;
        
    }
    
    
    public void setdatePeremption(Date datePeremption){
        
        
        this.datePeremption = datePeremption;
    }
    
    
    
   public int getnmbProduit(){
     
     return this.nmbProduit;
     
 }
    

    public void setnmbProduit(int nmbProduit){
        
        
        this.nmbProduit = nmbProduit;
    }
    
  public static Finder<Long , Produit> find = new Finder<Long,Produit>(Produit.class);
}