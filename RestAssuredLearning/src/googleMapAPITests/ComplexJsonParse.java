package googleMapAPITests;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(Payload.coursePrice());
		
		//1. Print No of courses returned by API
		
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//2.Print Purchase Amount
		int totalPurchased = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalPurchased);
		
		//3. Print Title of the first course
		String titleOfTheFirstCourse = js.getString("courses[0].title");
		System.out.println(titleOfTheFirstCourse);
		
		//4. Print All course titles and their respective Prices
		for (int i =0; i<count; i++) {
			String courseTitles = js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString()); 
			System.out.println(courseTitles);
		}

		//5. Print no of copies sold by RPA Course
		for (int i =0; i<count; i++) {
			String courseTitles = js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA")) {
				int copiesCount = js.get("courses["+i+"].copies");
				System.out.println(copiesCount);
				break;
			}
			
		}
		
		//6. Verify if Sum of all Course prices matches with Purchase Amount

	}
}
