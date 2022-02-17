package learningPOMWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogin {

	WebDriver driver;

	public  AccountLogin(WebDriver driver) {
		this.driver=driver;
	}

	public void enterEmailId(String emailId) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailId);
	}

	public void enterPassword(String pW) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pW);
	}

	public MyAccount clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new MyAccount(driver);
	}

}
