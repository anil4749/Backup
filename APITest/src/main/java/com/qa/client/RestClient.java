package com.qa.client;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void get(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(url);
		
		CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
		
		int statuscode = httpResponse.getStatusLine().getStatusCode();
		
		System.out.println("Status code is = " +statuscode);
		
		
		Header[] allHeaders= httpResponse.getAllHeaders();
		
	    HashMap<String, String> headers = new HashMap<String,String>();
	
	    for (Header apiHeaders:allHeaders) {
		
		headers.put(apiHeaders.getName(), apiHeaders.getValue());
	}
		
		System.out.println("All Headers Are = " +headers);
		
		String responceBody = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
		
		JSONObject jsonObject =new JSONObject(responceBody);
		
		System.out.println("Responce Body is "+jsonObject);
		
		
		
		
		
		
		
		
		
	}
	
	

}
