package learningPageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailIdTextbox;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public  AccountLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId(String emailId) {
		emailIdTextbox.sendKeys(emailId);
	}

	public void enterPassword(String pW) {
		password.sendKeys(pW);
	}

	public MyAccount clickOnLoginButton() {
		submit.click();
		return new MyAccount(driver);
	}

}
