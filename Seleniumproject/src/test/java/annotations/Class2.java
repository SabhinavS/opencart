package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	void advancesearch() {
		System.out.println("ABC from class2");
	}
	
	@AfterTest
	void n() {
		System.out.println("After test");	
	}
	
	
}
