/*
 * package learningSELENIUM;
 * 
 * import org.apache.log4j.BasicConfigurator; import org.openqa.selenium.By;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.ui.Select;
 * 
 * public class RegisterOnMultipleBrowserUsingUtilities {
 * 
 * public static void main(String[] args) {
 * 
 * BasicConfigurator.configure();
 * 
 * String browserType = "firefox";
 * 
 * // open the browser
 * 
 * WebDriver driver =
 * utilities.HandlingCommonActions.SelectBrowser(browserType);;
 * 
 * //enter the URL driver.get("http://janbaskdemo.com/");
 * 
 * //click on my account icon
 * driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
 * 
 * 
 * 
 * //click on register link
 * driver.findElement(By.xpath("//a[text()='Register']")).click();
 * 
 * 
 * //fill the form
 * driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(
 * "Anusha");
 * driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
 * "Gautam");
 * driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
 * "anushagautam@gmail.com");
 * driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(
 * "1234567890"); //select country from the drop down box WebElement countrydd1
 * = driver.findElement(By.id("input-country")); Select country =new
 * Select(countrydd1); country.selectByValue("149");
 * 
 * driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(
 * "test12");
 * driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(
 * "test12");
 * 
 * //driver.findElement(By.xpath("")).click(); //input[@type='radio'
 * and @checked='checked' and @name='customer_group_id']-- no radio button
 * //*[@id="content"]/form/fieldset[3]/div[1]/div/label[1]/input
 * 
 * //check the subscribe check box driver.findElement(By.name("agree")).click();
 * 
 * //select subscription frequency dd WebElement subdd1 =
 * driver.findElement(By.name("subscription")); Select subscription =new
 * Select(subdd1); subscription.selectByValue("Weekly");
 * driver.manage().window().maximize();
 * 
 * 
 * 
 * //Click on continue button
 * driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
 * 
 * //verify Registration is successful String regPageTitle = driver.getTitle();
 * if(regPageTitle.equals("Your Account Has Been Created!")) {
 * System.out.println("yay");
 * 
 * } else { System.out.println("dammn"); }
 * 
 * driver.close();
 * 
 * 
 * }
 * 
 * }
 */