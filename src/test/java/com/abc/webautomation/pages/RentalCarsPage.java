package com.abc.webautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalCarsPage  extends TestBase{
	
	@FindBy(xpath = "//p[text()='travel & fun • Rentalcars.com']")
	WebElement travelFunRentalCars;
	@FindBy(xpath = "//p[text()='travel & fun • Avillion Hotel Group']")
	WebElement travelFunAvilionHotelGroup;
	
	public RentalCarsPage() {
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	public void verifyProductValue() throws Throwable {
//		  verifyValue(travelFunRentalCars, "5% OFF car rental bookings");
//	  }
	
	public void verifyDetailsAndOtherDeals(String eValue1, String eValue2) throws Throwable {
		waitForVisibilityOf(travelFunRentalCars, driver);
		Thread.sleep(20000);
		verifyValue(travelFunRentalCars, eValue1);
		scrollToView(travelFunAvilionHotelGroup);
		verifyValue(travelFunAvilionHotelGroup, eValue2);
		closeBrowser();
		
	}
	

}
