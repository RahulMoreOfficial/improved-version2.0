package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywors {

	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public Properties orProp;
	public WebDriver driver; 
	
	
	public void openBrowser(String browserName)
	{
		System.out.println("Opening Browser  :"+ childProp.getProperty(browserName));
		if(childProp.getProperty(browserName).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(childProp.getProperty(browserName).equals("firefox")) {
			WebDriverManager.chromedriver().setup();
		}
	}
	public void navigate(String url)
	{
		System.out.println("navigating url : " + childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	public void click(String Locators)
	
	
	{
		
	}
	public void type(String locators, String text) 
	{
		
	}
	public void select(String locators, String option)
	{
		
	}
	public String getText() 
	{
		return null;
		
	}
	
}
