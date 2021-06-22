Feature: ABC rental cars features

  Scenario Outline: Verify the rental cars details
    Given I’m on "<country>"ABC page
		When I select ABC Deals
		And I would like to explore more for Rentalcars.com under Travel & Fun
		Then I will be able to see its "<details>" and other "<similardeals>"

Examples:
		|	country		|details											| similardeals											|
		|	Malaysia	|TRAVEL & FUN • RENTALCARS.COM|travel & fun • Avillion Hotel Group|
