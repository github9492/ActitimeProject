package qsp;

import java.io.IOException;

import com.actitime.generic.Filelib;

public class Demogenriclibrary {
	public static void main(String[] args) throws IOException {
		Filelib f = new Filelib();
		String url = f.getPropertyData("url");
		System.out.println(url);
	
String custname = f.getExcelData("firstproject", 1, 1);
	
	System.out.println(custname);
	
	f.setExcelData("firstproject", 1, 4, "pass");
	
	}

}