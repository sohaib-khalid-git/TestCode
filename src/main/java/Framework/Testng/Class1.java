package Framework.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void Test1()
	{
		System.out.println("Testcase 1 has been executed...");}
	@Test
	public void Test2()
	{
		System.out.println("Testcase 2 has been executed...");}
	@BeforeClass
	public void TestA()
	{
		System.out.println("Testcase 3 has been executed...before Class1");}
	@BeforeMethod
	public void Test3()
	{
		System.out.println("Testcase 3 has been executed...before Test1 and Test2 in Class1");}
	@AfterMethod
	public void Test4()
	{
		System.out.println("Testcase 4 has been executed...after Test1 and Test2 in Class1");}
}
