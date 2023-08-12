package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccounRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegTest extends BaseClass {
	
	
	@Test
	public void accountRegTest() {
		
		logger.debug("Debug mode starting");
		logger.info("Test case starting");
		
		try {
			
		logger.info("Account & register clicked");
		HomePage hp=new HomePage(driver);
		hp.clickAccount();
		hp.clickRegister();
		
		AccounRegPage arp=new AccounRegPage(driver);
		
		logger.info("Personal setails fillup");
		
		arp.setFirstname(randomString());
		arp.setLastname(randomString());
		arp.setEmail(randomString()+randomNumbers()+"@gmail.com");
		arp.setTelephone(randomNumbers());
		
		String password=randomAlphaNumeric();
		arp.setPassword(password);
		arp.setConfirmPass(password);
		arp.checkAgree();
		arp.clickSubmit();
	
		logger.info(" all done");
		Assert.assertEquals(arp.accountConfirmMsg(), true);
		}
		
		catch (Exception e) {
			Assert.fail();
		}
	}
	
	

}
