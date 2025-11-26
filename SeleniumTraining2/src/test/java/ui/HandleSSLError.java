package ui;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSLError {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(foptions);
		}
		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions coptions = new ChromeOptions();
			coptions.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(coptions);
		}
		
//		WebDriverManager.chromedriver().setup();
//		//deprecated
////		DesiredCapabilities dc = new DesiredCapabilities();
////		dc.setAcceptInsecureCerts(true);
//		
//		ChromeOptions coptions = new ChromeOptions();
//		coptions.setAcceptInsecureCerts(true);
//		
//		WebDriver driver = new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");
		//driver.manage().window().maximize();
		



	}

}
