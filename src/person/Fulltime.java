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
public class Fulltime extends Employee {
    
    private double salary ;
    public Fulltime(){
        
    }
    
    public Fulltime(double salary,int Id , String Name,String Phone ,String addres)
    {
        super(Id,Name,Phone,addres);
        this.salary=salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
     @Override
    public String toString()
    {
       return super.toString()+"\n salary:"+this.salary;
    }
}
