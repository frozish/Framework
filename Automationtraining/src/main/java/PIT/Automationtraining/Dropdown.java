package PIT.Automationtraining;

import java.nio.channels.spi.AbstractSelectionKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
WebElement createanaccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
createanaccount.click();
Thread.sleep(6000);
WebElement month = driver.findElement(By.name("birthday_month"));
Select ob=new Select(month);
ob.selectByValue("6");
WebElement day=driver.findElement(By.className("birthday_day"));
Select ob6=new Select(day);
ob6.selectByVisibleText("6");
	



	}

}
