package com.evs.orPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.evs.orBasePage.BasePg;



public class OrMarketingLeadsPg extends BasePg {
	@FindBy(xpath = "//a[text()='Marketing']")
	protected WebElement marketing;
	@FindBy(xpath ="//div[@id='Marketing_sub']//a[text()='Leads']" )
	protected WebElement clickLeadsBt;
//	@FindBy(xpath = "//img[@alt='Create Lead...']")
//	protected WebElement createLeads;
	@FindBy(xpath = "//input[@name='firstname']")
	protected WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	protected WebElement lastName;
	@FindBy(xpath = "//input[@name='company']")
	protected WebElement company;
	@FindBy(xpath = "//input[@name='email']")
	protected WebElement email;
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[1]" )
	protected WebElement save_bt;
//	@FindBy(xpath = "//a[text()='Sign Out']")
//	protected WebElement signout;

}
