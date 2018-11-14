Feature: Savings Calculator functionality
  			User can use savings calculator to estimate his/her investment growth over time

  Scenario: 
    Given User will navigate bankrate homepage
    When User will hover mouse on BANKING menu and click on Savingscalculator
    And User will enter InitialAmount "50,000"and MonthlyDeposit "500"and NumberofYears "1"
    And User will click Calculator Button
    Then User wil see his/her Final SavingsBalance

  Scenario: 
    Given User will navigate bankrate homepage
    When User will hover mouse on BANKING menu and click on Savingscalculator
    And User will enter InitialAmount "50,000"and MonthlyDeposit "500"and NumberofYears "5"
    And User will click Calculator Button
    Then User wil see his/her Final SavingsBalance

  Scenario: 
    Given User will navigate bankrate homepage
    When User will hover mouse on BANKING menu and click on Savingscalculator
    And User will enter InitialAmount "50,000"and MonthlyDeposit "500"and NumberofYears "10"
    And User will click Calculator Button
    Then User wil see his/her Final SavingsBalance
