package com.abc.webautomation.pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyLoanRepaymentCalculator extends TestBase{
	

	@FindBy(xpath = "//span[text()='S$']//parent::h3/div/input")
	WebElement propertyLoanAmount;
	
	@FindBy(xpath = "//span[text()='Year(s)']//parent::h3/div/input")
	WebElement propertyLoanTenre;
	
	@FindBy(xpath = "(//span[text()='%']//parent::h3/div/input[2])[1]")
	WebElement firstYearInterest;
	
	@FindBy(xpath = "(//span[text()='%']//parent::h3/div/input[2])[2]")
	WebElement secondYearInterest;
	
	@FindBy(xpath = "(//span[text()='%']//parent::h3/div/input[2])[3]")
	WebElement thirdYearInterest;
	
	@FindBy(xpath = "(//span[text()='%']//parent::h3/div/input[2])[4]")
	WebElement fourthYearInterest;
	
	@FindBy(xpath = "(//span[text()='%']//parent::h3/div/input[2])[5]")
	WebElement fifthYearInterest;
	
	@FindBy(xpath = "(//span[text()='Effective Interest Rate']//parent::div//span[1])[2]")
	WebElement effectiveInterestRate;
	
	@FindBy(xpath = "//span[text()='Total Interest Payable']//parent::div//span[2]")
	WebElement totalInterestPayable;
	
	@FindBy(xpath = "//span[text()='Total Amount Payable']//parent::div//span[2]")
	WebElement totalAmountPayable;
	
	@FindBy(xpath = "//table[@class='md-auto-layout']//tr")
	List<WebElement> loanRepaymentTableRow;
	
	
//	@FindBy(xpath = "//table[@class='md-auto-layout']//tr"+a)
//	List<WebElement> loanRepaymentTableColumn;
	
	
	
	public PropertyLoanRepaymentCalculator() {
		this.driver=getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void inputPropertyLoanRepaymentValue(String propertyLoanAmountValue, String propertyLoanTenreValue, String firstYearInterestValue, String secondYearInterestValue, String thirdYearInterestValue, String fourthYearInterestValue, String  fifthYearInterestValue) {
		
		scrollToView(propertyLoanAmount);
		input(propertyLoanAmount, propertyLoanAmountValue, driver);
		scrollToView(propertyLoanTenre);
		input(propertyLoanTenre, propertyLoanTenreValue, driver);
		input(firstYearInterest, firstYearInterestValue, driver);
		input(secondYearInterest, secondYearInterestValue, driver);
		scrollToView(secondYearInterest);
		input(thirdYearInterest, thirdYearInterestValue, driver);
		input(fourthYearInterest, fourthYearInterestValue, driver);
		scrollToView(fourthYearInterest);
		input(fifthYearInterest, fifthYearInterestValue, driver);
	}
	
	public void verifyRateInterestAmount(String effectiveInterestRateVale, String totalInterestPayableValue, String totalAmountPayableValue) throws Throwable {
		
		scrollToView(fifthYearInterest);
		verifyValue(effectiveInterestRate, effectiveInterestRateVale);
		verifyValue(totalInterestPayable, totalInterestPayableValue);
		verifyValue(totalAmountPayable, totalAmountPayableValue);
		
	}
	
	public WebElement totalLoanTenure() {
		int tableSize = loanRepaymentTableRow.size();
		WebElement totalTenureElement= driver.findElement(By.xpath("//table[@class='md-auto-layout']//tr["+tableSize + "]//td"));
		return totalTenureElement;
		
		
	}
	
	public void verifyTotalTenure(String totalTenureValue) throws Throwable {
		WebElement totalTenureElement = totalLoanTenure();
		verifyValue(totalTenureElement, totalTenureValue);
		
		
	}
	
	public void verifyYearsInterestRates(String YearInterestValue1, String YearInterestValue2, String YearInterestValue3, String YearInterestValue4, String YearInterestValue5) throws Throwable {
		YearInterestValue1 =calculateInterest(YearInterestValue1);
		YearInterestValue2 =calculateInterest(YearInterestValue2);
		YearInterestValue3 =calculateInterest(YearInterestValue3);
		YearInterestValue4 =calculateInterest(YearInterestValue4);
		YearInterestValue5 =calculateInterest(YearInterestValue5);
		
		HashMap<Integer, String> data = readData(loanRepaymentTableRow, "//table[@class='md-auto-layout']//tr");
		int totalTenure = loanRepaymentTableRow.size();
		int key=1;
		for(int i=2; i<=totalTenure;i++) {
			key=i-1;
			String aValue=data.get(key);
			if(i==2) {
				verifyValue(aValue,YearInterestValue1 );
			}else if(i==3) {
				verifyValue(aValue,YearInterestValue2 );
			}else if(i==4) {
				verifyValue(aValue,YearInterestValue3 );
			}else if(i==5) {
				verifyValue(aValue,YearInterestValue4 );
			}else if(i >=6) {
				verifyValue(aValue,YearInterestValue5 );
			}
		}
		
		closeBrowser();
		
	}
	
	

}
