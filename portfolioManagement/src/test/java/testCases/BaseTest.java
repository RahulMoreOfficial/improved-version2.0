package testCases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;

	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("beforeTest");
		app = new ApplicationKeywords();//object for the keyword class so we are able to access every keyword class behavior
		context.setAttribute("app", app);
	}
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("beforeMethod");
		context.getAttribute("app");	//		Itestcontetest method use to pass app reference in before method
	}
}
