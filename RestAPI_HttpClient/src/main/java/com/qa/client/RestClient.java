package com.qa.client;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	public void get(String url) throws ClientProtocolException ,IOException {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
		
		int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code is "+statusCode);
		
		
		//EntityUtils entityUtils = new EntityUtils();
		String responceString=EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responceJson = new JSONObject(responceString);
		System.out.println("responceJson is" +responceJson);
		
		
		 Header[] headersArray = closeableHttpResponse.getAllHeaders();
		 
		 HashMap<String ,String> allHeaders = new HashMap<String,String>();
		 
		 for(Header headers:headersArray) {
			 
			 allHeaders.put(headers.getName(), headers.getValue());
		 }
		 
		 System.out.println("All Headers are "+allHeaders);
		
	}
	
	
}
