package ui;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if (browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.notifications", 2); // block notifications
            options.setExperimentalOption("prefs", prefs);
            driver = new ChromeDriver(options);
		} else if (browser.equals("opera")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://mocdoc.com/user/loginform");
		driver.manage().window().maximize();
		driver.findElement(By.id("secret-user-name")).sendKeys("rajamani.m@mocdoc.net");
		driver.findElement(By.id("pwd")).sendKeys("Dummy@123");
		driver.findElement(By.id("patient-login")).click();
		driver.findElement(By.id("secret-user-name")).sendKeys("rajamani.m@mocdoc.net");
		driver.findElement(By.id("pwd")).sendKeys("Dummy@123");
		driver.findElement(By.id("patient-login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Wait until the modal disappears
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ms-loading-modal")));

		// Wait until the button is clickable and then click it
		wait.until(ExpectedConditions.elementToBeClickable(By.id("directcheckin"))).click();
        driver.findElement(By.id("searchinput")).clear();
        driver.findElement(By.id("searchinput")).sendKeys("1010102020");
        driver.findElement(By.id("search")).click();
        driver.findElement(By.xpath("//*[@id=\"tr1\"]/td[10]/div/div[2]/button/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"tr1\"]/td[10]/div/div[2]/ul/li[1]/a/span")).click();

		//driver.close();

	}

}
