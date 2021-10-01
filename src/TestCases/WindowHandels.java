package TestCases;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class WindowHandels {
public static void main(String args[]) throws Exception
{ 
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("D:\\NiT\\SoftwareTesting\\html\\multiplewindows.html");
	//open window2
	driver.findElement(By.id("btn1")).click();
	Thread.sleep(3000);
	//open window3
	driver.findElement(By.id("btn2")).click();
	//to handle multiple windows
	ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles());
	//pass argument as index 1st window at 0th index, navigate to 1st window
	driver.switchTo().window(wind.get(0));
	Thread.sleep(3000);
	driver.quit();
}
}	

