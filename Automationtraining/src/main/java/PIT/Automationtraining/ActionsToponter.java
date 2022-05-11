package PIT.Automationtraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsToponter {
	static WebDriver driver;
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		


		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions ob=new Actions (driver);
		ob.moveToElement(hovers).build().perform();
		

	}

}
