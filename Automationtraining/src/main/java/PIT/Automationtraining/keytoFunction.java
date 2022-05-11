package PIT.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keytoFunction {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();	
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	
	WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
//	searchtofiled.sendkeys("Computer");
	Actions ob=new Actions (driver);
	ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
}
}

