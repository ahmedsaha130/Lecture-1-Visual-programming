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
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee op0=new Employee(12555436,"Mohammed","056456","Jablia");//int Id , String Name,String Phone ,String addres
       Fulltime op1=new Fulltime(1000,12555436,"ahmed","056456","Gaza west");//double salary,int Id , String Name,String Phone ,String addres
         Parttime op2=new Parttime(5,10,12345,"Jamal","0594564548456","Gaza North");// houers_on,int price,int Id , String Name,String Phone ,String addres

       System.out.println(op0.toString());
       
       System.out.println(op1.toString());
       
       
       System.out.println(op2.toString());
        
          
        
    }
    
}
