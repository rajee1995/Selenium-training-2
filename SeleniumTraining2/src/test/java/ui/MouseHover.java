package ui;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2); // block notifications
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://mocdoc.com/user/loginform");
		driver.manage().window().maximize();
		driver.findElement(By.id("secret-user-name")).sendKeys("rajamani.m@mocdoc.net");
		driver.findElement(By.id("pwd")).sendKeys("Dummy@123");
		driver.findElement(By.id("patient-login")).click();
		driver.findElement(By.id("secret-user-name")).sendKeys("rajamani.m@mocdoc.net");
		driver.findElement(By.id("pwd")).sendKeys("Dummy@123");
		driver.findElement(By.id("patient-login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Wait until the modal disappears
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ms-loading-modal")));

		// Wait until the button is clickable and then click it
		wait.until(ExpectedConditions.elementToBeClickable(By.id("directcheckin")));
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/ul[1]/li[6]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableElement = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div[3]/ul[1]/li[6]/div/div/div/div/div[1]/div/span")));
		clickableElement.click();
		driver.findElement(By.xpath("//a[text()='Department']")).click();
		
		List<WebElement> rowelements = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/table/tbody/tr"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();
		
		List<WebElement> colelements = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td"));
		System.out.println(colelements.size());
		int colsize = colelements.size();
		
		for(int i=1; i<=rowsize; i++) {
			for(int j=1; j<=colsize; j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/table/tbody/tr["+ i +"]/td[\"+ j +\"]")).getText()+"  ");
			}
			System.out.println();
		}


	}

}
