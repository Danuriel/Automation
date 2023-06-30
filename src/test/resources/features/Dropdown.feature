Feature: Dropdown Menu Selection

  Scenario: The user selects the 2nd Option
    Given The user accesses the dropdown page
    When The user opens the dropdown menu
    And The user selects the first option in the dropdown
    And The user selects the second option in the dropdown
    Then The second option remains selected
