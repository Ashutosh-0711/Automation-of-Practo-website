Feature: Filter Doctor Details

  Scenario: Filter and Display Doctor Details
    Given User is on the Filter Details page
    When User clicks on the story filter
    And User selects the second story
    And User clicks on the experience filter
    And User selects the second experience option
    And User clicks on the all filters dropdown
    And User selects the fee filter
    And User selects the available today filter
    And User clicks on the sort by dropdown
    And User selects the consultation fee option
    And User scrolls the page
    Then User should see details of top 5 doctors including their name, experience, consultation fee, and clinic address
    And User clicks on the surgeries button