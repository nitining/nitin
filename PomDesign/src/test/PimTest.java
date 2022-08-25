package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	
	
	
	
	@Test(priority=0)
	public void verifypimpage() {
		loginpage.loginMethod();
		AssertJUnit.assertEquals(pimpage.titleofpimpage(), "PIM");
	}
	
	@Test
	public void verifycheckbox() {
		pimpage.check();
	}

}
