package TestCases;

// Note: Add TestNg.jar file for accessing assert statement 
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_DragAndDrop {
	public static void main(String args[]) throws Exception
	{ 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/"); 
		Thread.sleep(4000);
		//Verify the title using assert statement
		/*Verifying title using assert statement. The common functionality of assert statement is
		,in case of condition is true then it will continue the execution , 
		in case of condition is failed then it will stop the execution*/
		assertEquals("Droppable | jQuery UI",driver.getTitle()); 
		System.out.println("Title Matched");
		//Enter into Frame in case of frame we have only 3 options as argument id/name/index
		//index = frame is at which position 
		driver.switchTo().frame(0); 
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable"))).perform(); Thread.sleep(5000);
		System.out.println("DragandDropCompleted");
		//Exit from frame 
		driver.switchTo().defaultContent(); 
		driver.close();
	}
}