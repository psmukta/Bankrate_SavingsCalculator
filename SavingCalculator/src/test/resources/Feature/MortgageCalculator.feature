Feature: Mortgage Calculator functionality
  			User can use mortgage calculator to estimate his/her  monthly payment

  Scenario: 
    Given User will navigate bankrate homepage
    When User will hover mouse on Mortgages menu and click on Mortgagecalculator
    And User will enter MortgageAmount "300,000"and DownPayment "60,000"and InterestRate "4.88"
    And User will click Calculator Button
    Then User wil see his/her Actual monthly payment
