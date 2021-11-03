package com.demo.actitimeGeneric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils1 {
	public String getPropertyData(String filePath,String key)  {
		FileInputStream file;
		try {
	   file = new FileInputStream(filePath);
		Properties properties=new Properties();
	    properties.load(file);
	    return properties.getProperty(key);
		} catch (IOException e) {
		e.printStackTrace();
		}
		return null;
	}
}
