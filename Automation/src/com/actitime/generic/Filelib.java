package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is generic class for data driven testing
 * @author gaurav
 */
public class Filelib {
	
	
		/**
		 * this is generic method for reading the data from property file..
		 * @param arg
		 * @return
		 * @throws IOException
		 */

		public String getPropertyData(String key) throws IOException{
			FileInputStream fis = new FileInputStream("./data/commondata.property");
			Properties p = new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}
	/**
	 * this is generic method for reading the data from excel file..
	 * @param arg
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./data/customerdetails.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			return data;
	}
		/**
		 * this is generic method for writing the data from excel file..
		 * @param arg
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public void setExcelData(String sheetname,int row,int cell ,String data) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./data/customerdetails.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
			FileOutputStream fos=new FileOutputStream("./data/customerdetails.xlsx");
			wb.write(fos);
			wb.close();
		}
		
	}


