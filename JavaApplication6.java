/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class JavaApplication6 
{
   

    public static void main(String[] args) 
    {
        String file="Version.h";
        try
        {
             Scanner fs = new Scanner (new FileReader(file));
             do
             {
                 String isi = fs. nextLine();
                 System.out.println(isi);
                 
             
             
             }
             while (fs.hasNext());
        
        
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("Please Choose File with Version.h");
        
        }
       
    }
    
}
