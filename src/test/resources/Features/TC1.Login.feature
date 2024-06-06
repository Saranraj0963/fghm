@Login
Feature: Verifying the OMR branch horel login automation

  Scenario Outline: Verifying login with valid credentials
    Given User is on the OMR branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify success message after login "Welcome Saran"

    Examples: 
      | username                   | password      |
      | virusaranraj2525@gmail.com | Saranraj@2525 |

  @Login1
  Scenario Outline: Verifying login with valid credentials using Enter Key
    Given User is on the OMR branch hotel page
    When User enter "<username>" and "<password>" with Enter key
    Then User should verify success message after login "Welcome Saran"

    Examples: 
      | username                   | password      |
      | virusaranraj2525@gmail.com | Saranraj@2525 |

  @Login2
  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR branch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | username                   | password       |
      | virusaranraj2525@gmail.com | Saranrajj@2525 |
