package TestNGweek7assig4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGclass {

	@Test
	  public void f() {
		  System.out.println("Hello akashTest110");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Hello akashTest120");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Hello akashTest130");
	  }

	}


