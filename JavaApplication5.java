/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;



/**
 *
 * @author ctimberlake467
 */
public class JavaApplication5 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception 
    {
       File f=new File ("C:\\Users\\ctimberlake467\\Desktop\\data2.xls");
       Workbook wb=Workbook.getWorkbook (f);
       Sheet s = wb.getSheet(0);
       int row=s.getRows();
       int col=s.getColumns();
       for(int i = 0;i<14;i++)
       {
           for(int j = 0;j<1;j++)
           {
           Cell c = s.getCell(j,i);
           System.out.print(c.getContents()+"\t\t");
           
           }
           System.out.println("");
           
       
        }
    
    }
}
