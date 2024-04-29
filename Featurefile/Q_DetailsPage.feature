Feature: Search for Doctors

  Scenario: Search for a doctor in a specific city with a specific document type
    Given User is on the Details page
    When User clears the city field
    And User enters Bangalore in the city field
    And User enters Cardiologist in the document type field
    And User selects a document
    Then Relevant doctors in Bangalore with the specialty "Cardiologist" should be displayed
