/*
 * package utilities;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class HandlingCommonActions {
 * 
 * static WebDriver driver;
 * 
 * public static WebDriver SelectBrowser(String browserType) {
 * 
 * if (browserType.equalsIgnoreCase("chrome")) {
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
 * if (browserType.equalsIgnoreCase("Firefox")) {
 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
 * else { WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
 * 
 * } return driver; }
 * 
 * }
 */
