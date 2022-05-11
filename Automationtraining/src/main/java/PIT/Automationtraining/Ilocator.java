package PIT.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocator {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement Searchfieldtext= driver.findElement(By.name("field-keywords"));
		Searchfieldtext.sendKeys("Computer");
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		WebElement linktext= driver.findElement(By.linkText("Registry"));
		linktext.click();
		//WebElement outerto =driver=.findElement(by.partiallinkText(""))
	}

}
