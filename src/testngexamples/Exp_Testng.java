package testngexamples;
import org.testng.annotations.Test;
public class Exp_Testng {
	@Test //1 @Test is equal to 1 Test case 
	public void login()
	{
		System.out.println("Login Completed!!");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout Completed!!");
	}
}
