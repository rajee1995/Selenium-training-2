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

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());


	}

}
