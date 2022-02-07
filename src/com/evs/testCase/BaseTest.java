package com.evs.testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.evs.genericMethad.GenericMethad;
import com.evs.pageWise.LoginPg;
import com.evs.pageWise.MarketingLeads;

public class BaseTest {
	protected GenericMethad gm = new GenericMethad();
	
	@BeforeClass(alwaysRun = true)
	@Parameters("browserName")
	public void beforeclass11(String browser) {

		//String browser=gm.getPropObj().getProperty("browser_name");
		gm.launchBrowser(browser);
		String url=gm.getPropObj().getProperty("url");
		gm.openUrl(url);
	}
	@BeforeMethod (alwaysRun = true)
	@Parameters({"userName","password"})
	public void beforeMethad11(String username,String password) {
		LoginPg login = new LoginPg(gm);
//		String username=gm.getPropObj().getProperty("username");
//		String password=gm.getPropObj().getProperty("password");
		login.validLoginPage(username, password);
		//			HomePg home = new HomePg(gm);
		//			home.validHomePage();
	}

	@AfterMethod                 
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		MarketingLeads market = new MarketingLeads(gm);
		gm.click(market.getSignout());
	}
	@AfterClass                           
	public void closeAllTestCase() throws InterruptedException {
		System.out.println("vinay");
		Thread.sleep(2000);
		gm.close();
	}
}
