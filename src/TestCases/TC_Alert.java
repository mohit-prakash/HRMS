package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class TC_Alert {
	public static void main(String args[])throws Exception { 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("http://183.82.125.5/nareshit/login.php"); 
		System.out.println (driver.getTitle());
		driver.findElement (By.name ("txtUserName")).sendKeys ("nareshit"); 
		driver.findElement (By.name ("Submit")).click ();
		Thread.sleep (2000L);
		//enter into alert box
		Alert a= driver.switchTo ().alert ();
		//	To Retrive data from Alert 
		System.out.println (a.getText ());
		//	To click on Ok button on Alert 
		a.accept ();
		driver.findElement (By.name ("txtPassword")).sendKeys ("nareshit"); 
		driver.findElement (By.name ("Submit")).click ();
		Thread.sleep (2000);
		System.out.println ("Login completed"); 
		driver.findElement (By.linkText ("Logout")).click (); 
		driver.close();
	}
}
