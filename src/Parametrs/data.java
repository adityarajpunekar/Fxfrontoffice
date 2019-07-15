package Parametrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 public class data {
	 public  static void main(String[] args) throws EncryptedDocumentException,InvalidFormatException, IOException 
	 {
	 FileInputStream fis=new FileInputStream("D:/new projects for selenium/Fxfrontoffice/excel/Book1.xlsx");
  try{
	 Workbook wb=WorkbookFactory.create(fis);
	 Cell c =wb.getSheet("sheet1").getRow(0).getCell(0);
     Cell b =wb.getSheet("sheet1").getRow(0).getCell(1);
     String v=c.toString();
     String d=b.toString();
     System.out.print(v);
     System.out.print(d);
  }
     catch(Exception e) {
    	 e.printStackTrace();
    	 
     }
     
}
	 
	 
	 
}
