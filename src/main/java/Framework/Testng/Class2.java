package Framework.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {

	@AfterTest
	public void Test3()
	{
		System.out.println("Testcase 3 has been executed...after all testcases in suite");
	}	
	@BeforeTest
	public void Test4()
	{
		System.out.println("Testcase 4 has been executed...before all testcases in suite");
	}
	@Test
	public void Test5()
	{
		System.out.println("Testcase 5 has been executed...");
	}
	@AfterClass
	public void TestB()
	{
		System.out.println("Testcase B has been executed...after Class2");
	}
}
