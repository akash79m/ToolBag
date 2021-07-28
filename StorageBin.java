/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
import java.util.ArrayList;

/**
 * A class which stores items with unique identifiers
 * @param <T>
 * @param <U>
 */
public class StorageBin<T,U> {

    private ArrayList<T> itemsStored;
    private ArrayList<U> itemIDs;


    /**
     * Setting up the lists
     */
    public StorageBin(){
        this.itemsStored=new ArrayList<T>();
        this.itemIDs=new ArrayList<U>();
        

        //Your work starts here
    }
    
    //methos to find the size of the arrayList.
    public int SizeofBin()
    {
       return itemsStored.size(); 
    }
 
    //method to add item to the arrayList.
    public void addItems(T item, U id)
    {
        int flag = -1;
        for(int i=0;i<itemsStored.size();i++){
            
            if(itemIDs.get(i).equals(id)){
               flag++;
                System.out.println("error, ID already used");
                break;
            }
        }
      if(flag<0)
      {
          itemsStored.add(item);
          itemIDs.add(id);
      }
     
    }
    
    //method to rmove item from the arrayList.
    public T removeItem(U id)
    {
        itemIDs.remove(id);
        T temp=itemsStored.remove(itemsStored.indexOf(id));
        return temp;
       
    }
    
    //method to display all the items in the arrayList.
    public void displayItems()
    {
        for(int i=0;i<SizeofBin();i++)
        {
            System.out.println("item: "+itemsStored.get(i).toString()+" ID: "+itemIDs.get(i));  
        }
    }



}

