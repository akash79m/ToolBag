/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeAnalyzerTester {

    public static void main(String[] args) throws FileNotFoundException {

        GradeAnalyzer analyzer = new GradeAnalyzer();
        //Your work starts here
        System.out.println("Enter the filename to read from:");
        Scanner keyboard = new Scanner(System.in);

        //reading file from user.
        String filename = keyboard.nextLine();
        File inFile = new File(filename);
        Scanner input = new Scanner(inFile);
        String name;
        int grade;
        

        while (input.hasNext()) {
            name = input.next();
            if (input.hasNext()) {
                grade = input.nextInt();
                Record r = new Record();
                r.setName(name);
                r.setGrade(grade);
                analyzer.addRecord(r);
            }
        }
        input.close();

//function call statements.        
        analyzer.printAllRecords();
        analyzer.printHistogram();

    }
}
