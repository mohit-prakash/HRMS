package TestCases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("D:\\NiT\\SoftwareTesting\\html\\WebTable.html");
		//count 
		int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[5]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		//data at  specific cell
		String cell = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).getText();
		System.out.println(cell);
		//data of whole table
		for(int i=1;i<=row;i++,System.out.println())
		{
			String rowData = driver.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr["+i+"]")).getText();
			System.out.print(rowData);
		}
		driver.close();
	}
}
