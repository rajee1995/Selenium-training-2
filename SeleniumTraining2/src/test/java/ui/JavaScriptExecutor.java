package ui;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		
		//Print the title of the page
		String script = "return document.title;";
		String title = (String) jsexe.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		jsexe.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexe.executeScript("arguments[0].style.border='5px solid green'", button);
		Thread.sleep(2000);
		
		//Scrolling the page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement scrollbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[15]/div/p/a"));
		jsexe.executeScript("arguments[0].scrollIntoView(true)", scrollbutton);
		


	}

}
