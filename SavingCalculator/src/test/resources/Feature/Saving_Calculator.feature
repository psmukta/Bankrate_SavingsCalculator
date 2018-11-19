Feature: Savings Calculator functionality
  			User can use savings calculator to estimate his/her investment growth over time

  Scenario Outline: 
    Given User will navigate bankrate homepage
    When User will hover mouse on BANKING menu and click on Savingscalculator
    And User will enter InitialAmount"<InitialAmount>" , MonthlyDeposit "<MonthlyDeposite>" and NumberofYears "<NumberOfYears>"
    And User will click Calculator button
    Then User should see his/her Final SavingsBalance "<FinalSavings>"

    Examples: 
      | InitialAmount | MonthlyDeposite | NumberOfYears | FinalSavings |
      |         50000 |             500 |             1 | $59,530.61   |
      |         50000 |             500 |             5 | $104,477.85  |
      |         50000 |             500 |            10 | $179,810.76  |
