package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
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
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		driver.manage().window().maximize();
		
		List<WebElement> allTags = driver.findElements(By.id("Form_getForm_NoOfEmployees"));
		System.out.println("Total Tags: "+allTags.size());
		
		for(int i=0;i<allTags.size();i++)
		{
			System.out.println("Links on the page are: "+allTags.get(i).getAttribute("value"));
			System.out.println("Link text are: "+allTags.get(i).getText());
		}
	}

}
