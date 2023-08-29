package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertions {
	@Test(priority=1)
	void test1()
	{
		//int x=10 , y=100;
	//	String x="abc";
	//	String y="abc";
	if(true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(x,y,"x equals to y");
		//Assert.assertNotEquals(x,y); //fail
		//Assert.assertTrue(false); //fail
	}
}
