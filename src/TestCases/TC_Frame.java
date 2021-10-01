package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit"); 
		driver.findElement(By.xpath("//input[@type='Submit']")).click(); 
		Thread.sleep(5000L);
		//Entering into frame 
		driver.switchTo().frame("rightMenu");
		//Clicking on Add Button 
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("suresh"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("selenium"); 
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(2000L); 
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent(); 
		//Exit from Frame 
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click(); 
		driver.close();
		}
}

