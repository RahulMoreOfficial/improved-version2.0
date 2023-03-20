package testCases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
  @Test
  public void doLogin()
  {
	  System.out.println("doLogin");
	  app.openBrowser("chrome");
	  app.navigate("rediffurl");
//	  app.click("MyPortfolio_linktext");
//	  app.type("usermail_id", "rediffuser");
//	  app.type("userpassword_id", "rediffpassword");
//	  app.click("loginsubmit_id");
  }
  @Test
  public void doLogOut()
  {
	  System.out.println("doLogOut");
  }
}
