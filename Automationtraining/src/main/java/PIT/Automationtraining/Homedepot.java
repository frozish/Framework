package PIT.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {
	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
			driver.navigate().to("https://www.homedepot.com/");
			driver.manage().window().maximize();
			WebElement clickaccount=driver.findElement(By.className("MyAccount__label"));
			clickaccount.click();
			
			WebElement register=driver.findElement(By.className("bttn-outline"));
			register.click();
			
	}
	
	}