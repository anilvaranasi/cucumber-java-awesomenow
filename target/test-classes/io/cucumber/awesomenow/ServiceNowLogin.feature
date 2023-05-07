Feature: Login

  Scenario: Login to ServiceNow and Open Incident list
    Given I open login page
    When I enter username and password
    Then I open incidentlist
