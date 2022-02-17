package learningPOMWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourStore {
	
	WebDriver driver;
	
	public YourStore(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//click on my account icon
	public void clickOnMyAccountIcon() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
	}
	
	public AccountLogin clickOnLoginLink() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().window().maximize();
		return new AccountLogin(driver);
	}
}
