package testng;

import org.testng.annotations.Test;

public class innvocationcount {

	@Test(invocationCount=10)  //runs test multiple times 
	
	void test() {
		System.out.println("Test1 passed");
	}
}
