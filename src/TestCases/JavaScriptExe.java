package TestCases;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By;
public class JavaScriptExe {

		public static void main(String args[]) throws Exception
		{ 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.125.5/nareshit/login.php"); 
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit"); 
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//using javascriptExecuter to click on login btn
		WebElement element = driver.findElement(By.name("Submit")); 
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click();", element); 
		Thread.sleep(3000);
		System.out.println("Login completed");
		// using javascriptExecuter to click on logout
		WebElement logout = driver.findElement(By.linkText("Logout")); 
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		// 0 means true
		executor1.executeScript("arguments[0].click();", logout);
		System.out.println("Logout completed");
		driver.close();
		}
}
