package com.evs.genericMethad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethad {
	private	WebDriver driver;
	private Properties propObj;
	GenericMethad gm;
	
	public WebDriver getDriver() {
		return driver;
	}
	public GenericMethad()  {
		try {
		//File files=new File("config.properties");
		InputStream is=new FileInputStream("config.properties");
	    propObj=new Properties();
		
			propObj.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Properties getPropObj() {
		return propObj;
	}

	public void launchBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "Driver//geckodriver.exe");
		}
	}


	public void openUrl(String url) {
		driver.get(url);
	}

	public WebElement getElement(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public void close() {
		driver.close();
	}

	public void sendkeys(WebElement we, String value) {
		we.sendKeys(value);

	}

	public void click(WebElement we) {
		we.click();
	}
	public void clear(WebElement we) {
		we.clear();
	}

	public void dropDoun1(WebElement we, int number) {
		Select sle = new Select(we);
		sle.selectByIndex(number);
	}

	public void dropDoun2(WebElement we, String valueAtr) {
		Select sle = new Select(we);
		sle.selectByValue(valueAtr);
	}

	public void dropDoun3(WebElement we, String innarText) {
		Select sle = new Select(we);
		sle.selectByVisibleText(innarText);
	}

	public void dragAndDrop(WebElement args1, WebElement args2) {
		Actions act = new Actions(driver);

	}

	public void mouseover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
		
	}

	public void dishmissPopup() {
		driver.switchTo().alert().dismiss();

	}

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}
	
}
