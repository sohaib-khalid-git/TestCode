package Framework.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class4 {

	@BeforeSuite
	public void Test7()
	{
		System.out.println("Testcase 7 has been executed...before all testcases in Testsuite");
	}
	@AfterSuite
	public void TestD()
	{
		System.out.println("Testcase D has been executed...after all testcases in Testsuite");
	}
}
