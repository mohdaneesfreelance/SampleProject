package com.abc.webautomation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsPage extends TestBase{
	
	@FindBy(xpath="//h3[text()='PROPERTY LOAN REPAYMENT CALCULATOR']")
	WebElement propertyLoanRepaymentCalculator;
	
	@FindBy(xpath="//h3[text()='Renovation-i Financing Calculator']")
	WebElement renovationFinancingCalculator;
	
	WebDriver driver;
	
	public ToolsPage() {
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public PropertyLoanRepaymentCalculator clickPropertyLoanRepaymentCalculator() {
		String parentWindowHandle=driver.getWindowHandle();
		scrollToView(renovationFinancingCalculator);
		propertyLoanRepaymentCalculator.click();
		switchWindow(parentWindowHandle);
		return new PropertyLoanRepaymentCalculator();
		
	}

}
