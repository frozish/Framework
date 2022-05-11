package PIT.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
	static WebDriver driver;

	public static void main(String[] args, char[] windowhandle) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://www.cnn.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.navigate().refresh();
		String link=driver.getCurrentUrl();
		System.out.println(link);
	//	String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
	}

}
