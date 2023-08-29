package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingwritingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File---workbook---sheets---rows---cells
		
		//read data in excel using fileinputstream
		
		FileInputStream file=new FileInputStream("C:\\Excel material\\data.xlsx");
		
		//retrieve workbook from file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		

		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows=	sheet.getLastRowNum();
	
		int totalcolm=	sheet.getRow(1).getLastCellNum();
		
		System.out.println("no of rows is "+totalrows);
		System.out.println("no of rows is "+totalcolm);
		
		
		for(int r=0;r<=totalrows;r++)
		{
		XSSFRow currentrow=	sheet.getRow(r);
	
			for(int c=0;c<totalcolm;c++)
			{
				String value=currentrow.getCell(c).toString();
				System.out.print("     "+value);  //to get data in table format
			}
			System.out.println();	
		}
		workbook.close();
		file.close();
		
	}

}
