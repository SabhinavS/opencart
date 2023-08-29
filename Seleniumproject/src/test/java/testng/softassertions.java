package testng;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertions {
	
	@Test(priority=1)
	void test2()
	{
		//int x=10 , y=100;
		//Assert.assertEquals(x, y);//fail below statement will not execute
		//System.out.println("X is not equlas to y");
		
		SoftAssert sa=new SoftAssert();
		
	sa.assertEquals(1, 20);
	System.out.println("X is not equlas to y");
	sa.assertAll();   

	}
	
	
	
	
	
	
}
