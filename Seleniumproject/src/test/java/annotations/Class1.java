package annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	void search() {
		System.out.println("XYZ from class1");
	}	
	@BeforeTest
	void m() {

		System.out.println("Before test");
			
		}
	}
	

