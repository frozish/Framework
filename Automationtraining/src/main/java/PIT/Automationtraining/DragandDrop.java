package PIT.Automationtraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\Automationtraining\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();	
		driver.navigate().to("https://jqueryui.com");
		driver.manage().window().maximize();
		
		WebElement dropable=driver.findElement(By.linkText("Droppable"));
		dropable.click();
		driver.switchTo().frame(0);
		WebElement ElementtoDrag=driver.findElement(By.id("Draggable"));
		WebElement DropToHere=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(ElementtoDrag, DropToHere).build().perform();
		driver.switchTo().parentFrame();
		WebElement sorting=driver.findElement(By.linkText("Sortable"));
		sorting.click();
		



	}

}
