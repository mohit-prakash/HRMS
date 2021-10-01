package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
	public static void main(String[] args) throws Exception {
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//wait otherwise close immidiately
		Thread.sleep(3000);
		driver.close();
	}

}
