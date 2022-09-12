Feature: Number Passengers
  As QA automation
  I want add passengers
  to I cant travel

  Background: Accept cookies

    Given  user is on the volotea page
    When click in button accept cookies
    Then the user should see the home page

  Scenario: Select quantity of passengers
    Given  user is on the volotea home page
    When selecting the number of passengers in adults
      | adults |
      | 2      |
    Then the user should see that the baby section is disabled
