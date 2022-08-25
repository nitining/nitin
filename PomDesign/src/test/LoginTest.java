package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifylogin() {
		loginpage.loginMethod();
		AssertJUnit.assertEquals(pimpage.titleofpimpage(), "PIM");
	}

}
