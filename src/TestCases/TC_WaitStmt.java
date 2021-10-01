package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 
	public class TC_WaitStmt {
	public static void main(String[] args) throws Exception { 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php"); 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
	   //Explicit Wait for element to be clickable  4000ms
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='Submit']")));
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		//Implicit wait until page need to be loaded
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		System.out.println("Login completed"); 
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click(); 
		driver.quit();
	}
}
