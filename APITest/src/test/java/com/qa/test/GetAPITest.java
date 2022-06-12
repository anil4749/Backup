package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	
	
	
	String url;
	
	@BeforeMethod
	public void setup() {
	TestBase testBase=new TestBase();
	
	String serviceUrl=prop.getProperty("URL");
	String apiUrl = prop.getProperty("serviceURL");
	 url = serviceUrl + apiUrl;
	
	}
	
	@Test
	public void apiTest() throws ClientProtocolException, IOException {
		
		RestClient restClient=new RestClient();
		restClient.get(url);
		
	}

	
	
}
