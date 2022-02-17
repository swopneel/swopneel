package learningSELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterNewUser {
	
	public static void main (String[]args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		
		//Open the browser
		WebDriver driver =new ChromeDriver();
		
		
		//Enter the URL
		driver.get("http://janbaskdemo.com/");
		
		//Click on my Account icon
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		
		//Click on Register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//Fill the form
		//Enter First name
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Swopneel");
		//Enter last name
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Shrestha");
		//Enter email
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("shresthaswopneel1@gmail.com");
		//Enter telephone
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9841328018");
		
		//Select country from the drop-down
		WebElement countrydd1 = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select country =new Select(countrydd1);
		country.selectByValue("149");
		
		// enter new password
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test1234");
		//confirm the password 
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("test1234");
		
		//chose yes or no radio button for subscribe
		
		driver.findElement(By.xpath("//input[@value='0']")).click();
		
		
		// select the frequency from the subscription drop-down
		WebElement subtn = driver.findElement(By.name("subscription"));
		
		Select subscription =new Select(subtn);
		subscription.selectByValue("Weekly");
		driver.manage().window().maximize();
		
		//check the policy check box
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//click the continue button
		driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
		
		//validate the registration status
		String regPageTitle = driver.getTitle();
		if(regPageTitle.equals("Your Account Has Been Created!")) {
			System.out.println("yay");
			
		}
		else {
			System.out.println("dammn");
		}
		
		//close the browser
		driver.close();
		
	}

}
