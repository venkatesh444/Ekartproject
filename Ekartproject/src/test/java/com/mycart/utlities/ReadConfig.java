package com.mycart.utlities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}
		catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	
	public String getApplicationURL() {
		
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public String getUserName() {
		
		String username=pro.getProperty("username");
		
		return username;
	}
	
	public String getPassword() {
		
		String password=pro.getProperty("password");
		
		return password;
	}
	
	public String getChromepath() {
		
		String chromepath=pro.getProperty("chropath");
		return chromepath;
	}
	
public String getfirefoxpath() {
		
		String chromepath=pro.getProperty("firepath");
		return chromepath;
	}
	
}
