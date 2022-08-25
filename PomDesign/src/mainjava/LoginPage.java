package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
     @FindBy(xpath="//*[@name='username']")
     WebElement username;
     
     @FindBy(xpath="//*[@name='password']")
     WebElement password;
     
     @FindBy(xpath="//*[@type='submit']")
     WebElement submitlogin;
     
     
     public LoginPage(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
     
     public void loginMethod() {
    	 
    	 username.sendKeys("Admin");
    	 password.sendKeys("admin123");
    	 submitlogin.click();
     }

}
