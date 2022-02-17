package learningPFMWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailTextbox;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;

	public  AccountLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId(String emailId) {
		emailTextbox.sendKeys(emailId);
	}

	public void enterPassword(String pW) {
		password.sendKeys(pW);
	}

	public MyAccount clickOnLoginButton() {
		LoginBtn.click();
		return new MyAccount(driver);
	}

}
