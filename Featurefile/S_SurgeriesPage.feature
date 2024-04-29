Feature: Surgeries Page Functionality

  Scenario: View Various Surgeries and Navigate to Health & Wellness Plan
    Given User is on the Surgeries page
    When User scrolls to view the surgeries list
    Then User should see various surgeries listed
    And User clicks on the For Corporate button
    And User clicks on the Health & Wellness Plan button
