package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {

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
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("nathankps@yahoo.com");
		driver.findElement(By.name("username")).clear();
		System.out.println("Attribute: "+driver.findElement(By.name("username")).getAttribute("class"));
		System.out.println("CSS val: " +driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).getCssValue("text-decoration"));
		System.out.println("Location: "+driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).getLocation());
		System.out.println("Size: "+driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).getSize());
		System.out.println("TagName: "+driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).getTagName());
		System.out.println("Text: "+driver.findElement(By.xpath("//*[@id=\"topPanel\"]/p")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).isSelected());
		
		//driver.close();

	}

}
