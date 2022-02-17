package learningTestNGWithRealCode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowserAndEnterURL() {
		 //Open the browser
		//System.setProperty("webdriver.chrome.driver", "/Users/swopneelgautam/Swopneil/JanBaskLearningJavaBasics/chromedriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("http://janbaskdemo.com/");
		//driver.manage().window().maximize(); //this is to maximize the browser thats is being automated
		
	}
		@Test(priority = 3)
	   public void loginWithValidCredentials() throws InterruptedException {
		
		//click on my account page
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		
		//click on login link
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().window().maximize();
		
		//enter correct email id 
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jason.roger12@gmail.com");
		
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
		
	   }
		
		@Test(priority = 2)
		   public void loginWithInValidCredentials() throws InterruptedException {
			
			//click on my account page
			driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
			//driver.findElement(By.xpath("//span[text()='My Account']")).click();
			Thread.sleep(2000);
			
			//click on login link
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.manage().window().maximize();
			
			//enter correct email id 
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jason..roger@gmail.com");
			
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
			
		   }
		@Test(priority = 4)
		   public void loginWithNewValidCredentials() throws InterruptedException {
			
			//click on my account page
			driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
			//driver.findElement(By.xpath("//span[text()='My Account']")).click();
			Thread.sleep(2000);
			
			//click on login link
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.manage().window().maximize();
			
			//enter correct email id 
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");
			
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
			
		   }
		@Test(priority = 1)
		public void registration() {
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			
			//fill the form
			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Amita");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gautam");
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("amita.gautam1@gmail.com");
			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234577890");
				//select country from the drop down box
			WebElement countrydd1 = driver.findElement(By.id("input-country"));
			Select country =new Select(countrydd1);
			country.selectByValue("149");
			
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test12");
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("test12");
			
			//driver.findElement(By.xpath("")).click();
			//input[@type='radio' and @checked='checked' and @name='customer_group_id']-- no radio button
			//*[@id="content"]/form/fieldset[3]/div[1]/div/label[1]/input
			
			//check the subscribe check box
			driver.findElement(By.name("agree")).click();
			
			//select subscription frequency dd
			WebElement subdd1 = driver.findElement(By.name("subscription"));
			Select subscription =new Select(subdd1);
			subscription.selectByValue("Weekly");
			driver.manage().window().maximize();
			
			
			
			//Click on continue button
			driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
			
			//verify Registration is successful
			String regPageTitle = driver.getTitle();
			Assert.assertEquals("Your Account Has Been Created!", regPageTitle);
			
			/*if(regPageTitle.equals("Your Account Has Been Created!")) {
				System.out.println("yay");
				}
			else {
				System.out.println("dammn");
			}*/
			
		}
		
		@AfterMethod
		public void closeBrowser() {
		//close the browser
		driver.close();
		}
		
	

}
