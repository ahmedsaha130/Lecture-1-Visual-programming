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
public class Parttime extends Employee {
    private int houers_on;
    private int price;
    
    public Parttime(){
        
    }
    public Parttime(int houers_on,int price,int Id , String Name,String Phone ,String addres){
       super(Id,Name,Phone,addres);
        this.houers_on=houers_on;
        this.price=price;
    }
    public void sethouers_on(int houers_on){
        this.houers_on=houers_on;
    }
    public void setPrice(int price){
        this.price=price;
        
    }
    public int gethouers_on()
    {
        return this.houers_on;
    }
    public int getprice(){
        return this.price;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n price="+this.price+"\n houers_on="+this.houers_on;
    }
    
}
