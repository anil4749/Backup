package LaunchBrowse;



public class Post {

	public static void main(String[] args) {
RestAssure.BaseURI ="https://reqres.in/";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		httpRequest.headers("Content-Type","App/Jso");
		
		JsonObjest payload = new JsonObject();
		payload.put("name", "morpheus");
		payload.put("job", "leader");
		
		httpRequest.body(payload.toJsonString());
		
		Response response=httpRequse.request(Method.post,"api/users");
		
		

	}

}
