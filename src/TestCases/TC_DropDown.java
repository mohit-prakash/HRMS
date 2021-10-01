package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TC_DropDown {
public static void main(String args[]) throws Exception { 
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/login.php"); 
	System.out.println(driver.getTitle()); 
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit"); 
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); 	
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000); 
	System.out.println("Login completed");
	//Enter frame 
	driver.switchTo().frame("rightMenu");
	//Select the value  from search  by dropdown
	Select st = new Select(driver.findElement(By.name("loc_code"))); 
	st.selectByVisibleText("Emp. ID");
	Thread.sleep(4000);
	driver.findElement(By.name("loc_name")).sendKeys("0723"); 
	Thread.sleep(4000); 
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(4000);
	//Clicking on checkbox 
	driver.findElement(By.name("chkLocID[]")).click(); 
	Thread.sleep(4000);
	//delete selected
	driver.findElement(By.xpath("//input[@value='Delete']")).click(); 
	System.out.println("Successfully deleted");
	Thread.sleep(4000);
	driver.switchTo().defaultContent(); 
	driver.findElement(By.linkText("Logout")).click(); 
	System.out.println("Logout competed"); 
	driver.close();
}
}