package com.abc.webautomation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AbcDealsPage  extends TestBase{
	
	@FindBy(xpath = "//p[text()='Malaysia']")
	WebElement selectCountryModel;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[5]//*[name()='svg-icon']")
	WebElement travelFun;
	
	@FindBy(xpath = "//p[text()='travel & fun • Rentalcars.com']")
	List<WebElement> rentalCars;
	
	WebDriver driver;
	
	public AbcDealsPage() {
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry() {
		click(selectCountryModel,driver);
	}
	
	public void clickTravelFun() {
		click(travelFun,driver);
		
	}
	
	public RentalCarsPage clickOnDeals() {
		scrollToEnd(rentalCars);
		rentalCars.get(0).click();
		return new RentalCarsPage();
	}
	
	
  
  
}
