package googleMapAPITests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Payload;

public class AddPlaceAPITest {

	public static void main(String[] args) {

		// validate if add place API is working as expected

		// principle of Rest Assured is Given, when, then
		// given - all input details
		// when -submit the API
		// then - validate the response

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.AddPlace()).when().post("maps/api/place/add/json").then().log().all().assertThat()
				.statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)");

	}

}
