package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if (browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
//		driver.get("https://parabank.parasoft.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("customer.firstName")).sendKeys("Rajii");
//		Thread.sleep(1000);
//		driver.findElement(By.name("customer.lastName")).sendKeys("Rajii");
//		Thread.sleep(1000);
//		driver.findElement(By.className("input")).sendKeys("Address"); //will always select a first element with the class name
//		Thread.sleep(1000);
//		driver.findElement(By.tagName("input")).sendKeys("City"); //will always select a first element with the tag name
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();
		
//		driver.get("https://www.selenium.dev/documentation/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		//driver.findElement(By.linkText("Overview")).click();
//		driver.findElement(By.partialLinkText("Test")).click();
		
//		driver.get("https://mocdoc.com/user/home");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		WebElement ref = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[1]/button"));
//		driver.findElement(with(By.tagName("button")).toRightOf(ref)).click();
//		WebElement book = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[2]/button"));
//		driver.findElement(with(By.tagName("button")).toLeftOf(book)).click();
//      checking for git
		
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.name("password"));
		driver.findElement(with(By.tagName("input")).above(pwd)).sendKeys("xyz");
		WebElement user = driver.findElement(By.name("user-name"));
		driver.findElement(with(By.tagName("input")).below(user)).sendKeys("xyz");
		


	}

}
