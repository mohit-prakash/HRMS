package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice{
	public static void main(String[] args) throws Exception {
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Enter URL
		driver.navigate().to("http://www.flipkart.com");
		System.out.println("Url open Successfully!!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//Enter Data
		driver.findElement(By.name("q")).sendKeys("redmi mobile");
		//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//wait
		
		//click login
		Thread.sleep(1000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_4rR01T")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		//System.out.println("Login Successful!!");
		//wait
		//Thread.sleep(3000);
		//Click Logout
		//driver.findElement(By.linkText("Logout")).click();
		//System.out.println("Logout Successful!!");
		//wait
		//Thread.sleep(3000);
		//close browser
		//driver.close();
	}
}