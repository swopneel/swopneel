package learningPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithInvlaidCredentials {

	public static void main(String[] args) throws InterruptedException {
		
	    //Open the browser
		//System.setProperty("webdriver.chrome.driver", "/Users/swopneelgautam/Swopneil/JanBaskLearningJavaBasics/chromedriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("http://janbaskdemo.com/");
		//driver.manage().window().maximize(); //this is to maximize the browser thats is being automated
		
		//click on my account icon
		YourStore ys = new YourStore(driver);
		ys.clickOnMyAccountIcon();
		ys.clickOnLoginLink();
		/*
		 * driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		 * //driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 * Thread.sleep(2000);
		 */
		
		//click on login link
		
		AccountLogin ac = new AccountLogin(driver);
		
		
		
		/*
		 * driver.findElement(By.xpath("//a[text()='Login']")).click();
		 * driver.manage().window().maximize();
		 */
		
		//enter incorrect email id 
		ac.enterEmailId("jason.roger123@gmail.coom");
		/*
		 * driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
		 * "jason.roger@gmail.com");
		 */
		
		//enter incorrect password
		ac.enterPassword("test@12345");
		//driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		
		//click on login button
		ac.clickOnLoginButton();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verify login status
		MyAccount ma = new MyAccount(driver);
		ma.verifyLoginStaus();
		
		
		/*
		 * String loginPageTitle = driver.getTitle();
		 * 
		 * if (loginPageTitle.equals("My Account")){
		 * System.out.println("Login is successful"); } else {
		 * System.out.println("please check the credentials"); }
		 * 
		 * Thread.sleep(2000);
		 */
		
		//close the browser
		driver.close();
		
	}

}
