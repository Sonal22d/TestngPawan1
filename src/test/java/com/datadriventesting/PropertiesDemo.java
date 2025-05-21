package com.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\D Drive_bkp\\Java_Workspace1\\TestngPawan\\src\\test\\java\\com\\datadriventesting\\configProperties");
		Properties prop = new Properties();
		prop.load(fis);
		
		Set<Object> keys = prop.keySet();
		Collection value = prop.values();
		
		System.out.println(keys+" AND "+ value);
		
		String locator = prop.getProperty("appurl");
		String locator1 = prop.getProperty("email");
		System.out.println(locator);
		System.out.println(locator1);
	}
}
