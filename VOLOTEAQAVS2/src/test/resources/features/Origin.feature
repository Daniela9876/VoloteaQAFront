Feature:  validate origin
  As QA Automation
  I went select a origin
  to be able to travel

  Background: Accept cookies

    Given  user is on the volotea page
    When click in button accept cookies
    Then the user should see the home page

    Scenario: select origin
      Given  user is on the volotea home page
      When click in origin
      Then the user should see the available countries





