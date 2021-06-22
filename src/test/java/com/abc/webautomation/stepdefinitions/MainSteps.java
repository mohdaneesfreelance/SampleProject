package com.abc.webautomation.stepdefinitions;

import com.abc.webautomation.pages.AbcDealsPage;
import com.abc.webautomation.pages.PropertyLoanRepaymentCalculator;
import com.abc.webautomation.pages.RentalCarsPage;
import com.abc.webautomation.pages.ToolsPage;
import com.abc.webautomation.pages.UrlLandingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainSteps {
	
	private UrlLandingPage urlLandingPage;
	private RentalCarsPage rentalCarsPage;
	private AbcDealsPage abcDealsPage;
	private ToolsPage toolsPage;
	private PropertyLoanRepaymentCalculator propertyLoanRepaymentCalculator;
	
	
	
	@Given("^I’m on \"([^\"]*)\"ABC page$")
	public void i_m_on_ABC_page(String arg1) throws Throwable {
	    
		urlLandingPage = new UrlLandingPage(arg1);
		urlLandingPage.closeLandingPopup(arg1);
	 
	}

	@When("^I select ABC Deals$")
	public void i_select_ABC_Deals() throws Throwable {
		urlLandingPage.clickMenu();
		abcDealsPage =urlLandingPage.clickAbcDeals();
	    
	}

	@When("^I would like to explore more for Rentalcars\\.com under Travel & Fun$")
	public void i_would_like_to_explore_more_for_Rentalcars_com_under_Travel_Fun() throws Throwable {
		abcDealsPage.selectCountry();
		abcDealsPage.clickTravelFun();
		rentalCarsPage =abcDealsPage.clickOnDeals();
	    
	}

	@Then("^I will be able to see its \"([^\"]*)\" and other \"([^\"]*)\"$")
	public void i_will_be_able_to_see_its_and_other(String arg1,String arg2) throws Throwable {
		rentalCarsPage.verifyDetailsAndOtherDeals(arg1,arg2);
	}
	
	@Given("^I navigate to Tools page from menu$")
	public void i_navigate_to_Tools_page_from_menu() throws Throwable {
		urlLandingPage.clickMenu();
		toolsPage=urlLandingPage.clickTools();
		
	}
	
	@When("^I access to Property Loan Repayment Calculator from menu$")
	public void i_access_to_Property_Loan_Repayment_Calculator_from_menu() throws Throwable {
		propertyLoanRepaymentCalculator = toolsPage.clickPropertyLoanRepaymentCalculator();
		
	}
	
	@When("^I have inputted \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" values$")
	public void i_have_inputted_values(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		propertyLoanRepaymentCalculator.inputPropertyLoanRepaymentValue(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		
	    
	}
	
	@Then("^I will be able to see the \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_will_be_able_to_see_the_and(String arg1, String arg2, String arg3) throws Throwable {
	    
		propertyLoanRepaymentCalculator.verifyRateInterestAmount(arg1, arg2, arg3);
	    
	}

	@Then("^I will be able to see the loan repayment table with \"([^\"]*)\" that I’ve entered$")
	public void i_will_be_able_to_see_the_loan_repayment_table_with_that_I_ve_entered(String arg1) throws Throwable {
		propertyLoanRepaymentCalculator.verifyTotalTenure(arg1);
		     
	}
	
	@Then("^different interest rates \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" for different year based on my input$")
	public void different_interest_rates_for_different_year_based_on_my_input(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		propertyLoanRepaymentCalculator.verifyYearsInterestRates(arg1, arg2, arg3, arg4, arg5);
	}

	
	
}
