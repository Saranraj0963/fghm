@SelectHotel
Feature: Explore Hotels Module

  Scenario Outline: Book first hotel
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 |

  Scenario Outline: Book last hotel
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and price
    And User select the last hotel name and accept alert
    Then User should verify after select message "Book Hotel"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 |
