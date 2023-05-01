package vertex.Glass.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vertex.Glass.base.LoginPage;
import vertex.Glass.base.TestBase;




public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	
	
	
@BeforeMethod
public void setup() throws InterruptedException 
{
	initialization();
	loginPage = new LoginPage();
}
	
@Test(priority=1, enabled=true)
public void loginPageTitleTest() throws InterruptedException
{
	loginPage.login();
	
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "Home | ClaimDriver");
}

//@Test(priority=2, enabled=true)
//public void loginTest() throws IOException
//{
//	homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
//	boolean result = loginPage.LoginTest();
//	
//	Assert.assertFalse(result);
//	
//}




@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
