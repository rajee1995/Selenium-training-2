package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
      //FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://parabank.parasoft.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys("mobile");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Register']")).click(); //text() method xpath
		//driver.findElement(By.xpath("//input[starts-with(@id,'customer.firstName')]")).sendKeys("Rooney"); //starts-with xpath		
		//driver.findElement(By.xpath("//input[contains(@id,'last')]")).sendKeys("Wayne");  //contains xpath
		//driver.findElement(By.xpath("//input[contains(@id,'address')]")).sendKeys("Address");
		//driver.findElement(By.xpath("//input[contains(@id,'city')]")).sendKeys("City");
		//driver.findElement(By.xpath("//input[contains(@id,'state')]")).sendKeys("State");
		//driver.findElement(By.xpath("//input[contains(@id,'zip')]")).sendKeys("1111");
		//driver.findElement(By.xpath("//input[contains(@id,'phone')]")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//input[contains(@id,'ssn')]")).sendKeys("789789");
		//driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("@rooney95");
		//driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("@premier95!");
		//driver.findElement(By.xpath("//input[contains(@id,'repeatedPassword')]")).sendKeys("@premier95!");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@href,'index.htm')]")).click();
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("@rooney95");  //relative xpath
		//driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("@premier95!");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//driver.findElement(By.xpath("//input[@type='text' and @class='input']")).sendKeys("@rooney95");
		//driver.findElement(By.xpath("//input[@type='text' or @name='password']")).sendKeys("@premier95!");
		//driver.close();
		//driver.quit();
//		
//    	driver.get("https://mocdoc.com/user/home");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		WebElement ref = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[1]/button"));
//		driver.findElement(with(By.tagName("button")).toRightOf(ref)).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='input']//child::select")).click();
		
		//descendant will select all the dependent nodes or self will also select the root node we can also provide specific attributes as well
		//driver.findElement(By.xpath("//div[@id='app']//descendant::div")).click(); //orangehrms demo site
		//driver.findElement(By.xpath("//div[@id='app']//descendant-or-self::div[@class='oxd-sidepanel-header']")).click(); //orangehrms demo site
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu-item']//ancestor::ul")).click(); //ancestor and ancestor self are similar to dependent but in reverse order.
		
		//following selects all the nodes that appear after the current node & following sibling selects all the nodes that have the same parent as current node
		//li[@class='contact']//following::li
		//div[@id='bodyPanel']//following-sibling::div
		
		//preceding selects all the nodes that appear before the current node and preceding-sibling selects all the nodes that have same parent as the current node before the current node
		//*[@class='button']//preceding::a
		//*[@class='button']//preceding-sibling::a

	}

}