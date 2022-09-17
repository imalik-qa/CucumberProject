Feature: Logo Presence
  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open google home page
    Then I verity that the logo is present on page
    Then Get page title
    And Close browser

