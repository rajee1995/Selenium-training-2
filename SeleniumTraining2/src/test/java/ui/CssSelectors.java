package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

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
		
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.manage().window().maximize();
		//Id element in css is symbolized by # sign & other element are selected by tag-name[attribute='value']
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("input.btn_action")).click(); //class attribute can be selected using . sign
		//driver.close();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a.nav-link[href='/admin']")).click(); //class
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input.form-control[placeholder='Enter username']")).sendKeys("standard_user"); //Multiple Attributes with class
		//driver.findElement(By.cssSelector("input#password[placeholder='Password'][type='password']")).sendKeys("standard_user"); //Multiple Attributes with id
		
		//substring matching
		driver.findElement(By.cssSelector("input[name^='custom'][id*='er.fir']")).sendKeys("standard_user"); // ^ for prefix * for substring
		driver.findElement(By.cssSelector("input[name$='er.lastName']")).sendKeys("standard_user");  // $ for suffix
		//child and sub child
		driver.findElement(By.cssSelector("div.login input[name='username']")).sendKeys("standard_user"); //space between two attribute will select all child and sub child
		driver.findElement(By.cssSelector("div.login>input[name='password']")).sendKeys("standard_user"); //> will select child alone
		//driver.findElement(By.cssSelector("option[value='0']+option")).sendKeys("standard_user"); //selecting immediate sibling after the first condition, both must have same parent.
		//driver.findElement(By.cssSelector("select#month :first-child")).sendKeys("standard_user"); //will select the 1st child of the parent tag
		//driver.findElement(By.cssSelector("select#month :last-child")).sendKeys("standard_user"); //will select the last child of the parent tag
		//driver.findElement(By.cssSelector("select#month :nth-child(5)")).sendKeys("standard_user"); //will select the () mentioned child from start
		//driver.findElement(By.cssSelector("select#month :nth-last-child")).sendKeys("standard_user"); //will select the () mentioned child from last
		driver.findElement(By.cssSelector("ul.button>li:first-of-type")).sendKeys("standard_user"); // will select first of mentioned type (input, div, li) of child
		driver.findElement(By.cssSelector("ul.button>li:last-of-type")).sendKeys("standard_user"); // will select last of mentioned type of child
		driver.findElement(By.cssSelector("ul.button>li:nth-of-type(2)")).sendKeys("standard_user"); // will select mentioned number of type of child

	}

}
