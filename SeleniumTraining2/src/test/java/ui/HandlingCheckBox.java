package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBox {

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
		
		WebElement radio = driver.findElement(By.id("submit"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.findElement(By.xpath("//*[@value='PayPal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Credit/Debit Card']")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());


	}

}
