package com.evs.orBasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePg {

	
	@FindBy(xpath = "//img[contains(@title,'Create')]")
	protected WebElement create;
	@FindBy(xpath = "//a[text()='Sign Out']")
	protected WebElement singOut;
	@FindBy(xpath = "//input[contains(@title,'Save [Alt+S]')]")
	protected WebElement savebutten;
	@FindBy(xpath = "//input[contains(@title,'Cancel')]")
	protected WebElement cancel;
	
	//***********************************************
	
//	public WebElement getCreate() {
//		 return create;
//	}
//	public WebElement getSingout() {
//		return singOut;
//	}
//	public WebElement getCancel() {
//		return cancel;
//	}
}
