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
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Creates a storage bin and a workbelt. Adds items to the bin, then to the tool belt if requested.
 */
public class StorageBinTester {

    public static void main(String[] args) {



        StorageBin<Tool, Integer> bin = new StorageBin<Tool, Integer>();
        ArrayList<Tool> workbelt = new ArrayList<Tool>();


//Your work starts here
Scanner in=new Scanner(System.in);
System.out.println("Enter tools to be stored in the format ItemName ID"); 
System.out.println("Enter quit to end the list of tools");

 
String name;
int id;

//using do while loop
do
{
name=in.next();
id=in.nextInt();
if(name.equalsIgnoreCase("Hammer"))
{
     Hammer obj1 = new Hammer(name);
     obj1.setFunction("I hammer stuff");
     bin.addItems(obj1, id);
}
else if(name.equalsIgnoreCase("Saw"))
{
     Saw obj1 = new Saw(name);
     obj1.setFunction("I saw stuff");
     bin.addItems(obj1, id);
}
else if(name.equalsIgnoreCase("Level"))
{
     Level obj1 = new Level(name);
     obj1.setFunction("I make sure everything is even");
     bin.addItems(obj1, id);
}
}
while(!name.equalsIgnoreCase("quit"));

//Calling display method.
bin.displayItems();

System.out.println("Would you like to retrieve a tool and add it to the workbelt? yes/no");
String input2=in.next();

while(input2.equalsIgnoreCase("yes"))
{
    System.out.println("Enter item ID");
    int i=in.nextInt();
    System.out.println("Adding tool to the workbelt");
    workbelt.add(bin.removeItem(i));
}

//calling display method to display remaining tools
bin.displayItems();

for(int i=0;i<workbelt.size();i++){
    System.out.println(workbelt.get(i).toString());
        
    }

}
}
