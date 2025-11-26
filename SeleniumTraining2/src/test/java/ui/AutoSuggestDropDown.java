package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

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
		
		driver.get("https://bookonwardticket.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='selection']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("madrid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);


	}

}
