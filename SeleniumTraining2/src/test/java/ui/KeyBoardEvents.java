package ui;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]//div[5]/div[8]/pre"));
		Actions action = new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]//div[9]/pre/span"));
		action.keyDown(target, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();


	}

}
