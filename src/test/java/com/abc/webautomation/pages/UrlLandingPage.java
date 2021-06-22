package com.abc.webautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrlLandingPage extends TestBase{
	
	@FindBy(xpath  = "(//*[name()='svg'])[60]")
	WebElement landingpagePopupMalaysia;
	
	@FindBy(xpath  = "(//*[name()='svg'])[62]")
	WebElement landingpagePopupSingapore;
	
	@FindBy(xpath = "//*[name()='svg' and @class='stroke-current']")
	WebElement menu;
	
	@FindBy(xpath = "//div[contains(@class,'nav-pillars-wrapper')]/nav[@class='nav-pillar'][6]/a[3]")
	WebElement abcDeals;
	
	@FindBy(xpath = "//a[text()='Tools']")
	WebElement tools;
	
	WebDriver driver;
	
	
	public UrlLandingPage(String url) {
		report();
		if(url.equalsIgnoreCase("Malaysia")) {
			
			test = reports.startTest("TC- abc Deals : ", "This will verify deals present on ABC malaysia website");
			initialization("https://www.abc.com.my/en/personal/home.html");
		}else if(url.equalsIgnoreCase("Singapore")) {
			test = reports.startTest("TC- Property Loan Repayment Calculators : ", "This will display the interest rate and amount on loan");
			initialization("https://www.abc.com.sg/en/personal/index.html");
		}
		
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void closeLandingPopup(String url) {
		
		if(url.equalsIgnoreCase("Malaysia")) {
			click(landingpagePopupMalaysia,driver);
		}else if(url.equalsIgnoreCase("Singapore")) {
			click(landingpagePopupSingapore,driver);
		}
	}
	
	public void clickMenu() {
		click(menu,driver);
	}
	
	public AbcDealsPage clickAbcDeals() {
		click(abcDeals,driver);
		return new AbcDealsPage();
	}
	
	public ToolsPage clickTools() {
		click(tools, driver);
		return new ToolsPage();
	}
	
	

}
