/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author AhmedSalha
 */
public class Employee {
    private int Id ;
    private String Name;
    private String Phone ;
    private String  addres;
    
    
    public Employee()
    {
        
    }
    public Employee(int Id , String Name,String Phone ,String addres ){
              this.Name=Name; 
              this.Phone=Phone;
              this.Id=Id;
              this.addres=addres;
              
        
        }
    public void setId(int Id){
        this.Id=Id;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setPhone(String Phone){
        this.Phone=Phone;
    }
    public void setaddres(String addres){
        this.addres=addres;
    }
    public int getId()
    {
        return this.Id;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getPhone()
    {
       return  this.Phone;
       
    }
    public String getaddres()
    {
        return this.addres;
    }
    
    
    @Override
    public String toString()
    {
       return "\n Name:"+this.Name+"\n ID:"+this.Id+"\n Phone:"+this.Phone+"\n addres:"+this.addres;
    }
}
