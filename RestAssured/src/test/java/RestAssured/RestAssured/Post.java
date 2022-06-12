package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.apache.juneau.json.JsonParser;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {

	public static void main(String[] args) {
		RestAssured.baseURI ="https://reqres.in/";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		httpRequest.headers("Content-Type","application/json");
		
		JSONObject payload = new JSONObject();
		
		payload.put("name","morpheus");
		payload.put("job", "leader");
		
		httpRequest.body(payload.toString());
		
		Response response=httpRequest.request(Method.POST,"api/users");
		
		System.out.println("Response Code : "+response.statusCode() );
		System.out.println("Resonse Body : " + response.body().asPrettyString()); 
		System.out.println("--------------------------------------------------------");
		//---------------------------------------------------------------------------------------------------------------
		
		RestAssured.
		given().
//		baseUri("https://reqres.in/").
//		basePath("api/users").
		when().
		body(payload.toString()).
		header("Content-Type","application/json");
			
		
		response=requestSpecification.post();
				
		
		System.out.println(response.statusCode());
	//	System.out.println(response.body().asPrettyString());
		
		

	}

}
