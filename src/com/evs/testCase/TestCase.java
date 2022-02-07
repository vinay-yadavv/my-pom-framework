package com.evs.testCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.evs.genericMethad.GenericMethad;
import com.evs.pageWise.HomePg;
import com.evs.pageWise.LoginPg;
import com.evs.pageWise.MarketingLeads;
import com.evs.pageWise.SupportPg;

public class TestCase extends BaseTest {

	public static void main1(String[] args) {

		GenericMethad gm = new GenericMethad();
         
		String browser=gm.getPropObj().getProperty("browser_name");
		gm.launchBrowser(browser);
		String url=gm.getPropObj().getProperty("url");
		gm.openUrl(url);
		LoginPg login = new LoginPg(gm);
		String username=gm.getPropObj().getProperty("username");
		String password=gm.getPropObj().getProperty("password");
		login.validLoginPage(username, password);

		HomePg home = new HomePg(gm);
		home.validHomePage();

		MarketingLeads market = new MarketingLeads(gm);
		String name=gm.getPropObj().getProperty("name");
		String lastname=gm.getPropObj().getProperty("lastname");
		String company=gm.getPropObj().getProperty("company");
		String gmailid=gm.getPropObj().getProperty("gmailid");
		market.valid_marketingLeads(name,lastname,company,gmailid);
		
		//*********************************
		LoginPg login1 = new LoginPg(gm);
		String username1=gm.getPropObj().getProperty("username");
		String password1=gm.getPropObj().getProperty("password");
		login1.validLoginPage(username1, password1);

		HomePg homePg = new HomePg(gm);
		homePg.validHomePage();

		SupportPg support=new SupportPg(gm);
		String title=gm.getPropObj().getProperty("title");
		String hours=gm.getPropObj().getProperty("hours");
		String day=gm.getPropObj().getProperty("day");
		support.validSupportPg(title, hours, day);

	}
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//	GenericMethad gm = new GenericMethad();
//	
//	@BeforeClass                    
//	public void beforeclass11() {
//
//		String browser=gm.getPropObj().getProperty("browser_name");
//		gm.launchBrowser(browser);
//		String url=gm.getPropObj().getProperty("url");
//		gm.openUrl(url);
//	}
//	@BeforeMethod             
//	public void beforeMethad11() {
//		LoginPg login = new LoginPg(gm);
//		String username=gm.getPropObj().getProperty("username");
//		String password=gm.getPropObj().getProperty("password");
//		login.validLoginPage(username, password);
//		//			HomePg home = new HomePg(gm);
//		//			home.validHomePage();
//	}
//
	@Test( groups= "sainty",priority = 1)
	@Parameters({"name","lastname"})
	public void test1(String name,String lastname) {
		MarketingLeads market = new MarketingLeads(gm);
		//String name=gm.getPropObj().getProperty("name");
		//String lastname=gm.getPropObj().getProperty("lastname");
		String company=gm.getPropObj().getProperty("company");
		String gmailid=gm.getPropObj().getProperty("gmailid");
		market.valid_marketingLeads(name,lastname,company,gmailid);

	}

	@Test( groups= "smoke",priority = 2)            
	public void test2() {
		SupportPg support=new SupportPg(gm);
		String title=gm.getPropObj().getProperty("title");
		String hours=gm.getPropObj().getProperty("hours");
		String day=gm.getPropObj().getProperty("day");
		support.validSupportPg(title, hours, day);
	}
//	@AfterMethod               
//	public void logout() {
//		MarketingLeads market = new MarketingLeads(gm);
//		gm.click(market.getSignout());
//	}
//	@AfterClass                          
//	public void closeAllTestCase() throws InterruptedException {
//		System.out.println("vinay");
//		Thread.sleep(2000);
//		gm.close();
//	}
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
}