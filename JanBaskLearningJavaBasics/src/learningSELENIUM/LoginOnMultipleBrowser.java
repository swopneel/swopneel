package learningSELENIUM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOnMultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	    String browserType = "firefox";
	    WebDriver driver;
		
		// Open the browser
		if (browserType.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserType.equalsIgnoreCase("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		//System.setProperty("webdriver.chrome.driver", "/Users/swopneelgautam/Swopneil/JanBaskLearningJavaBasics/chromedriver");
		/*
		 * System.setProperty("webdriver.chrome.driver", "chromedriver"); WebDriver
		 * driver = new ChromeDriver();
		 */
		
		//Enter the URL
		driver.get("http://janbaskdemo.com/");
		//driver.manage().window().maximize(); //this is to maximize the browser thats is being automated
		
		//click on my account page
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		
		//click on login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().window().maximize();
		
		//enter correct email id 
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jason.roger@gmail.com");
		
		//enter correct password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		
		//click on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verify login status
		String loginPageTitle = driver.getTitle();
		
		if (loginPageTitle.equals("My Account")){
			System.out.println("Login is successful");
		}
		else {
			System.out.println("please check the credentials");
		}
		
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
	}

}
