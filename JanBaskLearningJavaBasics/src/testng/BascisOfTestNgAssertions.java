package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BascisOfTestNgAssertions {

	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("---This will open desired browser----@BeforeMethod");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("---This will close the Browser--- @AfterMethod");
	}

	@Test(priority = 2, enabled =false)
	public void Login() {
		System.out.println("This will login to the application");
	}

	@Test(priority = 1,enabled =false)
	public void Register() {
		System.out.println("This will register a new user");
	}

	@Test(priority = 3,enabled =false)
	public void Dashboard() {
		System.out.println("this pulls up the dashboard");
	}

	@Test
	public void testMaths() {
		Assert.assertEquals(addNums(12, 8), 21);
		/*
		 * if (checkBiggerNumber(12, 8)) { System.out.println("12 is greater than 8"); }
		 * else { System.out.println("12 is smaller than 8");
		 * 
		 * }
		 */
		//Assert.assertTrue(checkBiggerNumber(12, 80));
		//Assert.assertFalse(checkBiggerNumber(12, 80));
	}

	public boolean checkBiggerNumber(int i, int j) {
		if (i > j) {
			return true;
		} else {
			return false;
		}
	}
	
	public int addNums(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
