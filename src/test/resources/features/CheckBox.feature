Feature: Checkbox Clicking Test

  Scenario: The user cam tick the empty checkbox
    Given The user opens the checkbox page
    When The user ticks the BoxNumber 1 if not ticked
    Then Both boxes are ticked

