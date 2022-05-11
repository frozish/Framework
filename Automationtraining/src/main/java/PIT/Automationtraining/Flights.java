package PIT.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
			driver.navigate().to("https://www.expedia.com/");
			driver.manage().window().maximize();
		
		WebElement departure=driver.findElement(By.xpath("d1-btn"));
		departure.click();
		WebElement departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 4, 2022 selected, current check in date.']"));
		departuretodate.click();
		WebElement returndate=driver.findElement(By.xpath("//*[@aria-label='May 13, 2022 selected, current check in date.']"));
		returndate.click();
	}

}
