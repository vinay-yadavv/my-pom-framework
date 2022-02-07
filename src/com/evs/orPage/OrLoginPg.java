package com.evs.orPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrLoginPg {
	@FindBy(xpath = "//input[@name='user_name']")
	protected WebElement user_txt;
	@FindBy(xpath = "//input[@name='user_password']")
	protected WebElement pws_txt;
	@FindBy(xpath = "//input[@title='Login [Alt+L]']")
	protected WebElement golin_bt;
}
