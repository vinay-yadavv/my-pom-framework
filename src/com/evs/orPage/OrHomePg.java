package com.evs.orPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrHomePg {
	@FindBy(xpath = "//tr[@id='headerrow_14']//td[@align='right']")
	protected WebElement drag;
	@FindBy(xpath ="//tr[@id='headerrow_12']//td[@align='right']" )
	protected WebElement drop;
}
