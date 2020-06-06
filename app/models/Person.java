package models ;

import java.util.*;
import io.ebean.*;
import javax.persistence.*;


@Entity
public class Person extends Model {
  
private static final long serialVersionUID = 1L;

@Id
public long id;    
public String firstname ;
public int age ; 
    
    public Person(String firstname, int age){
        this.firstname=firstname;
        this.age=age;
    }
    
    public Person(){   
    }
    
    public String getFirstname(){
        return this.firstname;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    
    public long getId(){
        
        return this.id;
        
    }
    
    public void setId(long a){
        
        this.id = a;
        
    }
    
    public static Finder<Long, Person> find = new Finder<Long,Person>(Person.class);
}