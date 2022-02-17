package learningPageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStore {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement myAccountIcon;
	
	
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;

	public WebElement getMyAccountIcon() {
		return myAccountIcon;
	}
	
	
	public YourStore(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//click on my account icon
	public void clickOnMyAccountIcon() throws InterruptedException {
		
		myAccountIcon.click();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
	}
	
	public AccountLogin clickOnLoginLink() {
		
		loginLink.click();
		driver.manage().window().maximize();
		return new AccountLogin(driver);
	}
}
