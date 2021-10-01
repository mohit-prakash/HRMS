package testngexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testng2 {
	@BeforeClass
	public void login()
	{
		System.out.println("Login Completed!!");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("Logout Completed!!");
	}
	@Test(priority=1)
	public void addEmp()
	{
		System.out.println("Employee Added!!");
	}
	@Test(priority=2)
	public void delEmp()
	{
		System.out.println("Employee Deleted!!");
	}
}
