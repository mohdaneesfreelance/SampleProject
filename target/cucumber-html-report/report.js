$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RentalCars.feature");
formatter.feature({
  "line": 1,
  "name": "CIMB rental cars features",
  "description": "",
  "id": "cimb-rental-cars-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify the rental cars details",
  "description": "",
  "id": "cimb-rental-cars-features;verify-the-rental-cars-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I’m on \"\u003ccountry\u003e\"CIMB page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select CIMB Deals",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I would like to explore more for Rentalcars.com under Travel \u0026 Fun",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I will be able to see its \"\u003cdetails\u003e\" and other \"\u003csimilardeals\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "cimb-rental-cars-features;verify-the-rental-cars-details;",
  "rows": [
    {
      "cells": [
        "country",
        "details",
        "similardeals"
      ],
      "line": 10,
      "id": "cimb-rental-cars-features;verify-the-rental-cars-details;;1"
    },
    {
      "cells": [
        "Malaysia",
        "TRAVEL \u0026 FUN • RENTALCARS.COM",
        "travel \u0026 fun • Avillion Hotel Group"
      ],
      "line": 11,
      "id": "cimb-rental-cars-features;verify-the-rental-cars-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verify the rental cars details",
  "description": "",
  "id": "cimb-rental-cars-features;verify-the-rental-cars-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I’m on \"Malaysia\"CIMB page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select CIMB Deals",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I would like to explore more for Rentalcars.com under Travel \u0026 Fun",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I will be able to see its \"TRAVEL \u0026 FUN • RENTALCARS.COM\" and other \"travel \u0026 fun • Avillion Hotel Group\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Malaysia",
      "offset": 8
    }
  ],
  "location": "MainSteps.i_m_on_CIMB_page(String)"
});
formatter.result({
  "duration": 8398540930,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.i_select_CIMB_Deals()"
});
formatter.result({
  "duration": 142068876058,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.i_would_like_to_explore_more_for_Rentalcars_com_under_Travel_Fun()"
});
formatter.result({
  "duration": 399517572401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TRAVEL \u0026 FUN • RENTALCARS.COM",
      "offset": 27
    },
    {
      "val": "travel \u0026 fun • Avillion Hotel Group",
      "offset": 69
    }
  ],
  "location": "MainSteps.i_will_be_able_to_see_its_and_other(String,String)"
});
formatter.result({
  "duration": 34389576730,
  "status": "passed"
});
formatter.uri("propertyLoanRepaymentCalculator.feature");
formatter.feature({
  "line": 1,
  "name": "Property Loan Repayment Calculator feature",
  "description": "",
  "id": "property-loan-repayment-calculator-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify the property loan replayment calculator functionality",
  "description": "",
  "id": "property-loan-repayment-calculator-feature;verify-the-property-loan-replayment-calculator-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I’m on \"\u003ccountry\u003e\"CIMB page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to Tools page from menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I access to Property Loan Repayment Calculator from menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I have inputted \"\u003cpropertyLoanAmount\u003e\" \"\u003cpropertyLoanTenure\u003e\" \"\u003cfirstYearInterest\u003e\" \"\u003csecondYearInterest\u003e\" \"\u003cthirdYearInterest\u003e\" \"\u003cforthYearInterest\u003e\" \"\u003cfifthYearInterest\u003e\" values",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I will be able to see the \"\u003ceffectiveInterestRate\u003e\" \"\u003ctotalInterestPayable\u003e\" and \"\u003ctotalAmountPayable\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I will be able to see the loan repayment table with \"\u003cpropertyLoanTenure\u003e\" that I’ve entered",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "different interest rates \"\u003cfirstYearInterest\u003e\" \"\u003csecondYearInterest\u003e\" \"\u003cthirdYearInterest\u003e\" \"\u003cforthYearInterest\u003e\" \"\u003cfifthYearInterest\u003e\" for different year based on my input",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "property-loan-repayment-calculator-feature;verify-the-property-loan-replayment-calculator-functionality;",
  "rows": [
    {
      "cells": [
        "country",
        "propertyLoanAmount",
        "propertyLoanTenure",
        "firstYearInterest",
        "secondYearInterest",
        "thirdYearInterest",
        "forthYearInterest",
        "fifthYearInterest",
        "effectiveInterestRate",
        "totalInterestPayable",
        "totalAmountPayable"
      ],
      "line": 15,
      "id": "property-loan-repayment-calculator-feature;verify-the-property-loan-replayment-calculator-functionality;;1"
    },
    {
      "cells": [
        "Singapore",
        "10000",
        "5",
        "200",
        "200",
        "100",
        "100",
        "100",
        "1.63",
        "421",
        "10,421"
      ],
      "line": 16,
      "id": "property-loan-repayment-calculator-feature;verify-the-property-loan-replayment-calculator-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the property loan replayment calculator functionality",
  "description": "",
  "id": "property-loan-repayment-calculator-feature;verify-the-property-loan-replayment-calculator-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I’m on \"Singapore\"CIMB page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to Tools page from menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I access to Property Loan Repayment Calculator from menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I have inputted \"10000\" \"5\" \"200\" \"200\" \"100\" \"100\" \"100\" values",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I will be able to see the \"1.63\" \"421\" and \"10,421\"",
  "matchedColumns": [
    8,
    9,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I will be able to see the loan repayment table with \"5\" that I’ve entered",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "different interest rates \"200\" \"200\" \"100\" \"100\" \"100\" for different year based on my input",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Singapore",
      "offset": 8
    }
  ],
  "location": "MainSteps.i_m_on_CIMB_page(String)"
});
formatter.result({
  "duration": 5361137516,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.i_navigate_to_Tools_page_from_menu()"
});
formatter.result({
  "duration": 1300971139,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.i_access_to_Property_Loan_Repayment_Calculator_from_menu()"
});
formatter.result({
  "duration": 372893872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 17
    },
    {
      "val": "5",
      "offset": 25
    },
    {
      "val": "200",
      "offset": 29
    },
    {
      "val": "200",
      "offset": 35
    },
    {
      "val": "100",
      "offset": 41
    },
    {
      "val": "100",
      "offset": 47
    },
    {
      "val": "100",
      "offset": 53
    }
  ],
  "location": "MainSteps.i_have_inputted_values(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1864313010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.63",
      "offset": 27
    },
    {
      "val": "421",
      "offset": 34
    },
    {
      "val": "10,421",
      "offset": 44
    }
  ],
  "location": "MainSteps.i_will_be_able_to_see_the_and(String,String,String)"
});
formatter.result({
  "duration": 129256940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 53
    }
  ],
  "location": "MainSteps.i_will_be_able_to_see_the_loan_repayment_table_with_that_I_ve_entered(String)"
});
formatter.result({
  "duration": 48899300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 26
    },
    {
      "val": "200",
      "offset": 32
    },
    {
      "val": "100",
      "offset": 38
    },
    {
      "val": "100",
      "offset": 44
    },
    {
      "val": "100",
      "offset": 50
    }
  ],
  "location": "MainSteps.different_interest_rates_for_different_year_based_on_my_input(String,String,String,String,String)"
});
formatter.result({
  "duration": 955396048,
  "status": "passed"
});
});