package com.unitgenerator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Finder {
	
	private static String JAVA_HOME = System.getProperty("java.home");
	
	public static void find() {
		
		System.out.println();
		try {
			String path = "\"C:\\Program Files\\Java\\jdk1.8.0_161\\bin\\javap.exe\" -v C:\\Guidewire\\PolicyCenter\\build\\classdump\\sura\\pc\\lob\\cpp\\GeneralUtil_Ext.class";
			Process process = Runtime.getRuntime().exec(path);
		    InputStreamReader inputstream = new InputStreamReader(process.getInputStream());
		    BufferedReader bufferedinputstream = new BufferedReader(inputstream);
		    
		    
		    while(bufferedinputstream.readLine() != null) {
		    	System.out.println(bufferedinputstream.readLine());
		    }
		}catch(Exception  e) {
			System.out.println(e.getMessage());
		}
		
	}
	
    

}
