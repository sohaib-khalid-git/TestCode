package Framework.Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class3 {

	@Test
	public void Test6()
	{
		System.out.println("Testcase 6 has been executed...");
	}
	@BeforeClass
	public void TestC()
	{
		System.out.println("Testcase C has been executed...before Class3");
	}
}
