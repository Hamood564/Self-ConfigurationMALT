/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;


/**
 *
 * @author hamoo
 */
public class HTTPpost{
    
	public static void outputHeaders(URLConnection urlCon) {
    	Map<String, List<String>> map = urlCon.getHeaderFields();
   	 
   	 
    	for (String key : map.keySet()) {
    	    System.out.println(key + ":");
    	 
    	    List<String> values = map.get(key);
    	 
    	    for (String aValue : values) {
    	        System.out.println("\t" + aValue);
    	    }
    	}
	}
    
    public static String MLResponseValue(String Endpoint, String Input) throws MalformedURLException, ProtocolException, IOException {
       
        URL url = new URL(Endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json; utf-8"); 
        conn.setRequestProperty("Accept", "application/json");
 
        OutputStream os = conn.getOutputStream();
        os.write(Input.getBytes());
        os.flush();
        
        outputHeaders(conn);
        System.out.println("Response code: " + conn.getResponseCode());
 
        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
 
        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
            conn.disconnect();
            return output;
            
        }
               
        return output;
       
 
      
    }

    public static void main(String[] args) throws ProtocolException, IOException {
        String URL = "https://us-central1-endpoints-331108.cloudfunctions.net/function-1";
        String input = "{\"features\":[4,15500,100,238,40000,70000,400,50000,40000,5,4000,500,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9395,1,20,7500,-200,0,0,0,0,0,0,0,5530,40290,0,33031,1,0,30000,14000,0,6500,1,0,9970,17743,0,12677,1,0,30000,14000,0,6500,1,0,2021,8,6,18,24,42,4,1,1528.9,16.1,12.88]}";
        String Ml = HTTPpost.MLResponseValue(URL, input);
        System.out.println("The reponse is:" + Ml);
    }
    


}