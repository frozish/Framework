package PIT.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\msedgedriver.exe");
	driver=new EdgeDriver();	
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
WebElement Alert=driver.findElement(By.className("alert"));
Alert.click();
Thread.sleep(6000);
driver.switchTo().alert().accept();
WebElement prompting=driver.findElement(By.name("prompt"));
prompting.click();
Thread.sleep(6000);
	}

}
