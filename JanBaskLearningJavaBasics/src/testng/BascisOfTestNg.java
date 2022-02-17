package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BascisOfTestNg {
	
	
	@BeforeTest
	public void createDB() {
		System.out.println("this is @BeforeTest");
	}
	
	@BeforeTest
	public void connectWithDB() {
		System.out.println("this is @BeforeTest annotation");
		
	}
	@BeforeClass
	public void setProperties() {
		System.out.println("this is @BeforeClass annotation");
	}
	
	@BeforeMethod
	public void OpenBrowser()
	{
		System.out.println("---This will open desired browser----");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("---This will close the Browser---");
	}
	
	@Test
	public void Login()
	{
		System.out.println("This will login to the application");
	}
	@Test
	public void Register()
	{
		System.out.println("This will register a new user");
	}
	@Test
	public void Dashboard()
	{
		System.out.println("this pulls up the dashboard");
	}
}
