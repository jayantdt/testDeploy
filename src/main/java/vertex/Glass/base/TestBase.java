package vertex.Glass.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

public static WebDriver driver;

public static Properties prop;


//public TestBase()
//{
//	try {
//		
//		prop = new Properties();
//		//FileInputStream ip = new FileInputStream ("F:\\CDFramework\\ClaimDriver\\src\\main\\java\\vertex\\CD\\config\\config.properties");
//		FileInputStream ip = new FileInputStream ("./Properties\\config.properties");
//		prop.load(ip);
//	    }
//	catch (FileNotFoundException e) 
//	      {
//	    	e.printStackTrace();
//	      }
//	
//	catch (IOException e)
//	{
//	e.printStackTrace();	
//	}
//}

public static void initialization() throws InterruptedException
{
	
	System.out.println("In Initialisation");
	
	
	
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\102\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", chromepath);
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		

	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://demo.claimdriver.com/IWD/V2/Account/Login?ReturnUrl=/IWD/V2");
	Thread.sleep(3000);
	
	
}


}
