package learningPFMWithTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() {
		
	    //Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("http://janbaskdemo.com/");
		//driver.manage().window().maximize(); //this is to maximize the browser thats is being automated
	}
	
	@Test	
	public void login() throws InterruptedException {
		
	
	//click on my account icon
		YourStore ys = new YourStore(driver);
		 ys.clickOnMyAccountIcon();
		 AccountLogin login =ys.clickOnLoginLink();
		
		
		//click on login link
		login  = new AccountLogin(driver);
		
		
		//enter correct email id 
		login.enterEmailId("kerrie.wright@gmail.coom");
		
		//enter correct password
		login.enterPassword("test@1234");
		//driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		
		//click on login button
		login.clickOnLoginButton();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verify login status
		MyAccount ma = new MyAccount(driver);
		ma.verifyLoginStaus();
	}
		
		
		
		@AfterMethod
		public void closeApplication() {
		//close the browser
		driver.close();
		}
	

}
