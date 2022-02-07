package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.evs.genericMethad.GenericMethad;
import com.evs.orPage.OrLoginPg;

public class LoginPg extends OrLoginPg{

//	@FindBy(xpath = "//input[@name='user_name']")
//	private WebElement user_txt;
//	@FindBy(xpath = "//input[@name='user_password']")
//	private WebElement pws_txt;
//	@FindBy(xpath = "//input[@title='Login [Alt+L]']")
//	private WebElement golin_bt;
//***************************************
	private GenericMethad gm;

	public LoginPg(GenericMethad gm) {
		this.gm = gm;
		PageFactory.initElements(gm.getDriver(), this);
	}
//***************************************   
	//@BeforeMethod
	public void validLoginPage(String username, String password) {
            
		gm.clear(user_txt);
		gm.sendkeys(user_txt, username);
		gm.clear(pws_txt);
		gm.sendkeys(pws_txt, password);
		gm.click(golin_bt);
		

	}

	public void invalidLoginPage() {
	
	
	}

}
