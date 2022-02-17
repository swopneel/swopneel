package learningPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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
		 AccountLogin login =ys.clickOnLoginLink();
		/*
		 * driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		 * //driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 * Thread.sleep(2000);
		 */
		
		//click on login link
		
		login  = new AccountLogin(driver);
		
		
		
		/*
		 * driver.findElement(By.xpath("//a[text()='Login']")).click();
		 * driver.manage().window().maximize();
		 */
		
		//enter correct email id 
		login.enterEmailId("jason.roger@gmail.com");
		/*
		 * driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
		 * "jason.roger@gmail.com");
		 */
		
		//enter correct password
		login.enterPassword("test@1234");
		//driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		
		//click on login button
		login.clickOnLoginButton();
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
		driver.quit();
		
	}

}
