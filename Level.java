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
public class Level extends Tool
{
    String function;
    
    //constructor
    public Level(String name) 
    {
        super(name);
        
    }
    //setter
    public void setFunction(String function)
    {
        this.function=function;
    }
    
    //ToString method
    @Override
    public String toString()
    {
       return super.toString()+""+function;
    }
    
}
