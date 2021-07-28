/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
//This class extends from Tool class(inheritence)
public class Saw extends Tool 
{
 String function;
    
    public Saw(String name) 
    {
        super(name);
           
    }
    
    //set Function
    public void setFunction(String function)
    {
        this.function=function;
    }
    
    //To String method
    @Override
    public String toString()
    {
       return super.toString()+" "+function;
    }   
    
}
