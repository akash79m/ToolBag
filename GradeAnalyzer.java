
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */

/**
 * Basic record keeping class
 */
public class GradeAnalyzer {

    //setting up a list for Records and for storing summary data on grades
    private ArrayList<Record> gradeList;
    private int[] gradeSummary;

    public GradeAnalyzer(){
       //your work starts here
       gradeList = new ArrayList<Record>();
       gradeSummary = new int[10];
    }
    
    //method to add a record in the list.
     public void addRecord(Record r)
     {
         gradeList.add(r);
     }
     
     //method to remove a record from the list.
     public void removeRecord(Record r)
     {
        gradeList.remove(r);
     }
     
     //method to clear all the record from the list.
     public void clearAllRecords()
     {
        gradeList.clear();
     }
     
     //method to print all the record of the list. 
     public void printAllRecords()
     {
        for(int i=gradeList.size()-1;i>=0;i--)
        {
            System.out.println(gradeList.get(i).getName()+","+gradeList.get(i).getGrade());
        }
     }
     
     //method to print histogram
     public void printHistogram()
     {
         for(int i=0;i<gradeList.size();i++)
         {
         
         if(gradeList.get(i).getGrade()>0 && gradeList.get(i).getGrade()<11)
         {
             gradeSummary[0]++;
         }
         else if(gradeList.get(i).getGrade()>10 && gradeList.get(i).getGrade()<21)
         {
             gradeSummary[1]++;
         }
         else if(gradeList.get(i).getGrade()>20 && gradeList.get(i).getGrade()<31)
         {
             gradeSummary[2]++;
         }
         else if(gradeList.get(i).getGrade()>30 && gradeList.get(i).getGrade()<41)
         {
             gradeSummary[3]++;
         }
         else if(gradeList.get(i).getGrade()>40 && gradeList.get(i).getGrade()<51)
         {
             gradeSummary[4]++;
         }
         else if(gradeList.get(i).getGrade() >50 && gradeList.get(i).getGrade()<61)
         {
             gradeSummary[5]++;
         }
         else if(gradeList.get(i).getGrade()>60 && gradeList.get(i).getGrade()<71)
         {
             gradeSummary[6]++;
         }
         else if(gradeList.get(i).getGrade()>70 && gradeList.get(i).getGrade()<81)
         {
             gradeSummary[7]++;
         }
         else if(gradeList.get(i).getGrade()>80 && gradeList.get(i).getGrade()<91)
         {
             gradeSummary[8]++;
         }
         else if(gradeList.get(i).getGrade()>90 & gradeList.get(i).getGrade()<101)
         {
             gradeSummary[9]++;
         }
         }
         
     int flag =0;
     int count =0;
     for( int i =0; i<10;i++)
     {
         System.out.print(count+"-"+(count+10)+"|");
       for (int j=0;j<gradeSummary[flag];j++)
       {
           System.out.print("*");
       }
       count+=10;
           flag++;
           System.out.println("");
           
       }
     }
     
    }








