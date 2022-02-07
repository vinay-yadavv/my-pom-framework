package com.evs.pageWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.genericMethad.GenericMethad;
import com.evs.orPage.OrHomePg;

public class HomePg extends OrHomePg {
	
//	@FindBy(xpath = "//tr[@id='headerrow_14']//td[@align='right']")
//	private WebElement drag;
//	@FindBy(xpath ="//tr[@id='headerrow_12']//td[@align='right']" )
//	private WebElement drop;
	
	
	//*******************************
	private GenericMethad gm;
	public HomePg(GenericMethad gm) {
		this.gm=gm;
	PageFactory.initElements(gm.getDriver(),this);
	}
	//*******************************
	public void validHomePage() {
		gm.dragAndDrop(drag, drop);
		
		
	}
	
	
	public void invalidHomePage() {
		
		
	}

}
