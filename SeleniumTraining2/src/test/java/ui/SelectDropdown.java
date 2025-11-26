package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
//		
//		WebElement ddown = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(ddown);
//		
//		WebElement firstOption = select.getFirstSelectedOption();
//		System.out.println(firstOption.getText());
//		
//		select.selectByIndex(5);
//		Thread.sleep(2000);
//		
//		select.selectByValue("Canada");
//		Thread.sleep(2000);
//		
//		select.selectByVisibleText("Bahamas");
//		Thread.sleep(2000);
     
		WebElement ddown = driver.findElement(By.id("cars"));
		Select select = new Select(ddown);
		
		select.selectByValue("volvo");
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		
		select.deselectAll();
		
		select.selectByValue("saab");
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.deselectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		
	}

}