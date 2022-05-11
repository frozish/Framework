package PIT.Automationtraining;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	
static WebDriver driver; 

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(Picture);

	}

}
