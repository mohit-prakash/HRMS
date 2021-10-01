package TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class TC_RobotClass {
public static void main(String args[]) throws Exception{
//Test case steps 
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://183.82.125.5/nareshit/login.php");
	System.out.println("Application Opened"); 
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
	//Perform TAB & Enter using KeyBoard actions 
	Robot r = new Robot(); 
	r.keyPress(KeyEvent.VK_TAB); 
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER); 
	r.keyRelease(KeyEvent.VK_ENTER); 
	Thread.sleep(3000); 
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click(); 
	System.out.println("Logout completed"); 
	driver.close();
}
}
