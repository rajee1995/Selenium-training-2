package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BasicWebdriverMethods {

	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if (browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("opera")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		String source = driver.getPageSource();
		System.out.println("Source: "+source);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> WebElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println("Element: "+ WebElements);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String windowhandle = driver.getWindowHandle();
		System.out.println("windowhandle: "+windowhandle);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("windowhandles: "+windowhandles);
		
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		
	}

}
