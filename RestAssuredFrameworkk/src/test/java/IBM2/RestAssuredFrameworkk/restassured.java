package IBM2.RestAssuredFrameworkk;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restassured {

	String BASE_URI = "https://petstore.swagger.io/v2/";
	String PATH = "user/";
	static String username = "Nav";
	
	public RequestSpecification connect(String base){
		RestAssured.baseURI = base;
		return RestAssured.given();
	}
	
	private void validateLog(int sts, Response resp){
		resp.then().statusCode(sts).log().all();
	}
	
	@SuppressWarnings("unchecked")
	private String genusrData(String un, String fn, String ln, String email, String pass, String phone, int user){
		JSONObject jone = useJson();
		jone.put("username", un);
		jone.put("firstName", fn);
		jone.put("lastName", ln);
		jone.put("email", email);
		jone.put("password", pass);
		jone.put("phone", phone);
		jone.put("Username", user);
		
		return jone.toString();
	}
	
	private JSONObject useJson(){
		return new JSONObject();
	}
	
	@Test(dataProvider="loginData", dependsOnMethods={"firstPOST"})
	public void login(String usrnam, String pass){
		System.out.println("LOG IN");
		
		validateLog(200,connect(BASE_URI).queryParam("username", usrnam).queryParam("password", pass).get(PATH+"login"));			
		
	}
	
	@Test(dependsOnMethods={"firstPOST"}, dataProvider="putData")
	public void firstPUT(String un, String fn, String ln, String email, String pass, String phone, int user){
		System.out.println("PUT");
		
		validateLog(200,connect(BASE_URI).contentType(ContentType.JSON).body(genusrData(un, fn, ln, email, pass, phone, user)).when().put(PATH+un));
	
	}
	
	@Test(dependsOnMethods={"firstPUT"},dataProvider="deleteData")
	public void firstDELETE(String id){
		System.out.println("DELETE");
		
		validateLog(200, connect(BASE_URI).delete(PATH+id));
	
	}
	
	@Test(dataProvider="postData")
	public void firstPOST(String un, String fn, String ln, String email, String pass, String phone, int user){
		System.out.println("CREATE");

		validateLog(200, connect(BASE_URI).contentType(ContentType.JSON).body(genusrData(un, fn, ln, email, pass, phone, user)).when().post(PATH));
	
	}
	
	@DataProvider(name="postData")
	public Object[][] providerPOST(){
		Object[][] postData = {
			{username,"test","test", "test@abc.com", "qwerty123","9999988888", 0}
		};		
		return postData;
	}
	
	@DataProvider(name="putData")
	public Object[][] providerPUT(){
		Object[][] putData = {
			{username,"Nav","nav", "abc@xyz.com", "pass123","8888899999", 0}
		};
		return putData;
	}
	
	@DataProvider(name="deleteData")
	public Object[][] providerDELETE(){
		Object[][] deleteData = {{username}};
		return deleteData;
	}
	
	@DataProvider(name="loginData")
	public Object[][] providerLogin(){
		Object[][] loginData = {{username, "pass123"}};
		return loginData;
	}

	
}
