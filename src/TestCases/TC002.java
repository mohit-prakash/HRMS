/*Test case2 steps:-
  	1.Launch Browser
  	2.Enter URL i.e http://183.82.125.5/nareshit/login.php
  	3.Enter username and password 
  	4.click login
  	5.click logout
 */
package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC002 {

	public static void main(String[] args) throws Exception {
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Enter URL
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		System.out.println("Application open Successfully!!");
		//Verify Title Compare Actual and Expected
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title Matched!!");
		}
		else
		{
			System.out.println("Title Not Matched!!");
			System.out.println("Actual Title is "+driver.getTitle());
		}
		//Enter Data
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		//click login
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successful!!");
		Thread.sleep(3000);
		//Mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover Completed!!");
		Thread.sleep(3000);
		//click on submenu
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Submenu clicked!!");
		Thread.sleep(3000);
		//Click Logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successful!!");
		Thread.sleep(3000);
		//close browser
		driver.close();
	}
}
