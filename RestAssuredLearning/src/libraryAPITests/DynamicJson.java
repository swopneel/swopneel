package libraryAPITests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class DynamicJson {
	
	@Test(dataProvider="bookData")
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI= "http://216.10.245.166";
		String response = given().header("Content-Type", "application/json").
		body(Payload.AddBook(isbn, aisle)).
		when().
		post("/Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response().asString();
		JsonPath js = ReusableMethods.rawToJson(response);
		String id = js.get("ID");
		System.out.println(id);
		
	}
	@DataProvider(name = "bookData")
	public Object[][] getData() {
		return new Object [][] {{"adhdjk","hg7y"},{"hda3jfk","udt8"}, {"ghjfj","guygf6"}};
	}
	
}
