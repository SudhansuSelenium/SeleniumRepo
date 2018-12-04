Feature: test homepage

@Test
  Scenario: Login validation
    Given user has access the Magento page
    When user has entered the username and password
    Then user sees the My Dashboard page
