package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@Given("Open the Browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("Enter the URL")
	public void enter_the_url() {
		driver.get("http://janbaskdemo.com/");
	}

	@When("Click on the My Account icon")
	public void click_on_the_my_account_icon() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		// driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
	}

	@When("Click on the login link")
	public void click_on_the_login_link() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().window().maximize();
	}

	@When("Enter correct email as {string}")
	public void enter_correct_email_as(String email) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	}

	/*
	 * @When("Enter correct email") public void enter_correct_email() {
	 * driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
	 * "jason.roger@gmail.com"); }
	 */

	@When("Enter correct pw as {string}")
	public void enter_correct_pw_as(String pw) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pw);
	}

	/*
	 * @When("Enter correct pw") public void enter_correct_pw() {
	 * driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
	 * "test@1234"); }
	 */

	@When("^Fill the login credentials$")
	public void fill_the_login_credentials(DataTable data) throws Throwable {

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(data.cell(0, 0));
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(data.cell(0, 1));
		System.out.println(data.cell(0, 2));
		System.out.println(data.cell(0, 3));
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Validate the login status")
	public void validate_the_login_status() throws InterruptedException {
		String loginPageTitle = driver.getTitle();

		if (loginPageTitle.equals("My Account")) {
			System.out.println("Login is successful");
		} else {
			System.out.println("please check the credentials");
		}

		Thread.sleep(2000);
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@When("Enter correct email")
	public void enter_correct_email() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kerrie.wright@gmail.com");
	}

	@When("Enter correct pw")
	public void enter_correct_pw() {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
	}

	
	@When("^Enter correct (.+) as username$")
    public void enter_correct_as_username(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        //throw new PendingException();
    }

    @And("^Enter correct (.+) as password$")
    public void enter_correct_as_password(String pw) throws Throwable {
    	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pw);
        //throw new PendingException();
    }
}
