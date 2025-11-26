package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.asx.com.au/");
		driver.manage().window().maximize();
		
		//1. Switch to frame which has that particular table
		//2. Get the number of rows
		//3. Get the number of columns
		//4. Iterate rows and columns and get test and print it
		
		WebElement frame1  = driver.findElement(By.id(""));
		driver.switchTo().frame(frame1);
		
		List<WebElement> rowelements = driver.findElements(By.xpath(""));
		System.out.println("Number of rows: "+rowelements.size());
		int rowsize = rowelements.size();
		
		List<WebElement> colelements = driver.findElements(By.xpath(""));
		int colsize = colelements.size();
		System.out.println("Number of columns: "+colelements.size());
		
		for(int i=1; i<=rowsize; i++) {
			for(int j=1; j<=colsize; j++) {
				System.out.print("Table content: "+driver.findElement(By.xpath("")).getText()+"  ");
			}
			System.out.println();
		}



	}

}
