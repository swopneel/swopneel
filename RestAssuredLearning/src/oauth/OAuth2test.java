package oauth;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;

public class OAuth2test {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", null)

		
		String accessTokenresponse = given()
		.queryParams("code", "" )
		.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com" )
		.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W" )
		.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php" )
		.queryParams("grant_type", "authorization_code" )
		.when().log().all()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(accessTokenresponse);
		String accessToken = js.getString("access_token");
		
		
		
		String response = given().queryParam("access_token", accessToken)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();

		System.out.println(response);

	}

}
