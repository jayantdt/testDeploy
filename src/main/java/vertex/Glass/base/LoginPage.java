package vertex.Glass.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vertex.Glass.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory - OR
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//li[contains(text(),'Bad Username/Password.')]")
	WebElement BadUNPWD;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public  boolean LoginTest()
	{
		try {
		return BadUNPWD.isDisplayed();
		}
		catch (Exception e){
			System.out.println("Login Successful");
		}
		return false;
	}
	
	
	
	public void login() throws InterruptedException
	{
	    username.sendKeys("jay@vertexcs.com");
	    password.sendKeys("Welcome1");
	    loginBtn.click();
	    Thread.sleep(3000);
	  //  return new HomePage();
	    
	}

}
