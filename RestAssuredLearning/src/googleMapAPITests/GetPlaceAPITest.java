package googleMapAPITests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetPlaceAPITest {

	public static void main(String[] args) {
		
		//Add place - Update Place with New Address - get Place to validate if the New Address is present in response
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("maps/api/place/add/json").then().assertThat().
		statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().
		response().asString();
		
		
		System.out.println(response);
		JsonPath js = new JsonPath(response); // for parsing Json
		String placeId = js.getString("place_id");
		System.out.println("---"+ placeId);
		
		// Update place
		
		String newAddress = "Summer Walk, Africa";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").
		body("{\n"
				+ "\"place_id\":\""+placeId+"\",\n"
				+ "\"address\":\""+newAddress+"\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}").
		when().put("maps/api/place/update/json").then().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		

		//Get place
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).
		when().get("maps/api/place/get/json").then().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = ReusableMethods.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		
		
		//Cucumebr JUnit/ TestNG
		Assert.assertEquals(newAddress, actualAddress);
		
		
		
	}	

}
