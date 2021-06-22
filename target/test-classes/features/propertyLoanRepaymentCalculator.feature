Feature: Property Loan Repayment Calculator feature
  

  
  Scenario Outline: Verify the property loan replayment calculator functionality
    Given I’m on "<country>"ABC page
		And I navigate to Tools page from menu
		When I access to Property Loan Repayment Calculator from menu
		And I have inputted "<propertyLoanAmount>" "<propertyLoanTenure>" "<firstYearInterest>" "<secondYearInterest>" "<thirdYearInterest>" "<forthYearInterest>" "<fifthYearInterest>" values
		Then I will be able to see the "<effectiveInterestRate>" "<totalInterestPayable>" and "<totalAmountPayable>"
		And I will be able to see the loan repayment table with "<propertyLoanTenure>" that I’ve entered 
		And different interest rates "<firstYearInterest>" "<secondYearInterest>" "<thirdYearInterest>" "<forthYearInterest>" "<fifthYearInterest>" for different year based on my input
		
Examples:
		|	country		| propertyLoanAmount | propertyLoanTenure | firstYearInterest | secondYearInterest | thirdYearInterest | forthYearInterest | fifthYearInterest |	effectiveInterestRate	|	totalInterestPayable	|	totalAmountPayable	|
		|	Singapore	|	10000							 |	5									|	200								|	200								 |	100							 |	100							 |	100							 |	1.63									|	421										|	10,421							|