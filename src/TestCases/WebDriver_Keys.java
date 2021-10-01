package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class WebDriver_Keys{
	public static void main(String args[]) throws Exception	{ 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in"); 
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("selenium tutorial"); 
		Thread.sleep(5000); 
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN); 
		Thread.sleep(3000);	
		System.out.println("Firsttime down arrow pressed"); 
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN); 
		Thread.sleep(3000);
		System.out.println("Second time down arrow pressed"); 
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
		Thread.sleep(3000);
		System.out.println("clicked on Enter btn"); 
		driver.quit();
}
}
