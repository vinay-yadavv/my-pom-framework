package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.evs.genericMethad.GenericMethad;
import com.evs.orPage.OrMarketingLeadsPg;

public class MarketingLeads extends OrMarketingLeadsPg {
	
//	@FindBy(xpath = "//a[text()='Marketing']")
//	private WebElement marketing;
//	@FindBy(xpath ="//div[@id='Marketing_sub']//a[text()='Leads']" )
//	private WebElement clickLeadsBt;
//	@FindBy(xpath = "//img[@alt='Create Lead...']")
//	private WebElement createLeads;
//	@FindBy(xpath = "//input[@name='firstname']")
//	private WebElement firstName;
//	@FindBy(xpath = "//input[@name='lastname']")
//	private WebElement lastName;
//	@FindBy(xpath = "//input[@name='company']")
//	private WebElement company;
//	@FindBy(xpath = "//input[@name='email']")
//	private WebElement email;
//	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[1]" )
//	private WebElement save_bt;
//	@FindBy(xpath = "//a[text()='Sign Out']")
//	private WebElement signout;
	
	//*********************************************
	private GenericMethad gm;
	public MarketingLeads(GenericMethad gm) {
		this.gm=gm;
		PageFactory.initElements(gm.getDriver(),this);
  
	}
	public WebElement getSignout() {
		return singOut;
	}
	 //*********************************************
	
public void valid_marketingLeads(String firstname,String lastname,String companyname,String gmailId ) {
		
	    gm.mouseover(marketing);
		gm.click(clickLeadsBt);
		gm.click(create);
		gm.sendkeys(firstName,firstname);
		gm.sendkeys(lastName,lastname);
		gm.sendkeys(company,companyname);
		gm.sendkeys(email,gmailId);
		gm.click(save_bt);
		gm.acceptPopup();
		//gm.click(signout);
      
	} 
	public void invalid_marketingLeads() {
		
	}

}
