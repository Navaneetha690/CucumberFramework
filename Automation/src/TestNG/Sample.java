package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample 
{
	
	@BeforeMethod
	public void Bmethod()
	{
		System.out.println("Before method----");
	}
	@Test
	public void test1()
	{
		System.out.println("Test method1----");
	}
	

	@BeforeClass
	public void Bclass()
	{
		System.out.println("Before class----");
	}

	@AfterClass
	public void Aclass()
	{
		System.out.println("After class----");
	}

	@AfterMethod
	public void Amethod()
	{
		System.out.println("After method----");
	}

	@BeforeTest
	public void Btest()
	{
		System.out.println("Before test---");
	}

	@AfterTest
	public void Atest()
	{
		System.out.println("After Test----");
	}

	@BeforeSuite
	public void Bsuite()
	{
		System.out.println("Before suite----");
	}

	@AfterSuite
	public void Asuite()
	{
		System.out.println("After suite----");
	}
	@BeforeGroups
	public void Bgroup()
	{
		System.out.println("After Group----");
	}
	@AfterGroups
	public void Agroup()
	{
		System.out.println("After Group----");
	}
	

	
}
