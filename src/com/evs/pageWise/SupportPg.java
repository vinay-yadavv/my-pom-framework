package com.evs.pageWise;

import org.openqa.selenium.support.PageFactory;
import com.evs.genericMethad.GenericMethad;
import com.evs.orPage.OrSupportPg;

public class SupportPg extends OrSupportPg {
	
//@FindBy(xpath = "//a[text()='Support']")
//private WebElement support;
//@FindBy(xpath = "//img[@title='Create Trouble Tickets...']")
//private WebElement create;
//@FindBy(xpath = "//textarea[@name='ticket_title']")
//private WebElement title;
//@FindBy(xpath = "//input[@id='hours']")
//private WebElement hours; 
//@ FindBy(xpath = "//input[@id='days']")
//private WebElement days;
//@FindBy(xpath = "(//input[@class='crmbutton small save'])[2]")
//private WebElement save;  
//*****************************************
GenericMethad gm;

public SupportPg(GenericMethad gm) {
	this.gm=gm;
	PageFactory.initElements(gm.getDriver(),this);
}
//*****************************************
public void validSupportPg(String tit,String hou,String day) {
	gm.click(support);
	gm.click(create);
	gm.sendkeys(title, tit);
	gm.sendkeys(hours, hou);
	gm.sendkeys(days, day);
	gm.click(savebutten);
	gm.acceptPopup();
	//gm.close();
}










}