package com._520it._01._connection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;



import org.junit.Test;

public class HttpsURLConnectionTest {

	@Test
	public void testURL() throws Exception {
		
		URL url =new URL("http://www.520it.com/");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		InputStream inputStream = connection.getInputStream();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		
		String line = null;
		while((line =reader.readLine()) !=null){
			System.out.println(line);
			
			
		}
		reader.close();
		
		
		
		
	
	
	
	
	
	
	}
}
