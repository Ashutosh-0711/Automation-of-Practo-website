Feature: Form Submission

  Scenario: Submit Form with Invalid Details
    Given User is on the Form page
    When User enters invalid details in the form
    And User selects organization size and area of interest
    And User clicks on the Schedule a demo button
    Then User should not be able to submit the form

  Scenario: Submit Form with Valid Details
    Given User is on the Form page
    When User enters valid details in the form
    And User selects organization size and area of interest
    And User clicks on the Schedule a demo button
    Then User should see a confirmation message
