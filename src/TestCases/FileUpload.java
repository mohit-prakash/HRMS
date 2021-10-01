package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.125.5/nareshit/login.php"); 
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit"); 
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		//frame arg is name/id/index
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		//click Add
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//Enter first name
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mohit");
		//Enter last name
		driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("Prakash");
		//to upload a file
		WebElement pic = driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
		pic.sendKeys("D:\\NiT\\SoftwareTesting\\pic1.jpeg");
		Thread.sleep(5000);
		System.out.println("File uploaded successfully");
		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		Thread.sleep(5000);
		System.out.println("New Employee added");
		//exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
