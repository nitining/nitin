package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	
	@FindBy(xpath="//*[contains(@class,'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]")
	WebElement txtpage;
	
	@FindBy (xpath="//*[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
    WebElement checkbox;
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String titleofpimpage() {
		return txtpage.getText();
		
	}
	
	public void check() {
		checkbox.click();
	}
	
	
	
}   
