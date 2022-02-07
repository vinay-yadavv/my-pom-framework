package com.evs.orPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.evs.orBasePage.BasePg;

public class OrSupportPg extends BasePg {
	@FindBy(xpath = "//a[text()='Support']")
	protected WebElement support;
//	@FindBy(xpath = "//img[@title='Create Trouble Tickets...']")
//	protected WebElement create;
	@FindBy(xpath = "//textarea[@name='ticket_title']")
	protected WebElement title;
	@FindBy(xpath = "//input[@id='hours']")
	protected WebElement hours; 
	@ FindBy(xpath = "//input[@id='days']")
	protected WebElement days;
//	@FindBy(xpath = "(//input[@class='crmbutton small save'])[2]")
//	protected WebElement savebutten;  
}
