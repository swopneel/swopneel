package learningPFMWithTestNG;

import org.openqa.selenium.WebDriver;

public class MyAccount {

	WebDriver driver;

	public MyAccount(WebDriver driver) {
		this.driver = driver;

	}

	public void verifyLoginStaus() throws InterruptedException {
		String loginPageTitle = driver.getTitle();

		if (loginPageTitle.equals("My Account")) {
			System.out.println("Login is successful");
		} else {
			System.out.println("please check the credentials");
		}

		Thread.sleep(2000);
	}

}
