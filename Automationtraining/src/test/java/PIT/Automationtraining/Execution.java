package PIT.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
 WebDriver driver;
	@Test
  public void f() {
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is befotrMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
	
	  
	  

  }

  @BeforeClass
  public void beforeClass() {
	  Browsers("Chrome");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is beafter  test annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is aftertest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() throws  {
	  System.out.println("this is aftersuite annotation");
	  
	 File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshot, new File("C:\\Users\\nadia\\eclipse-workspace\\vavation\\Pictures\\ShotofPage.jpg"));
	 
	  
  }
private Object TakesScreenshot(WebDriver driver2) {
	// TODO Auto-generated method stub
	return null;
}
public void Browsers(String window) {
	if(window.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to ("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
	}else if(window.equalsIgnoreCase("FirefoxDriver")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		  driver.navigate().to ("https://www.facebook.com/");
		  
	}else if(window.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\geckodriver.exe");
		driver = new EdgeDriver();
		  driver.navigate().to ("https://www.facebook.com/");
		
	}
}
}
	
	
		
	

	
	


