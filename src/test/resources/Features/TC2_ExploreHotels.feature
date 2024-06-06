@Search
Feature: Explore Hotels Module

  @Search1
  Scenario Outline: Search hotels with all fields
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 |

  @Search2
  Scenario Outline: Search hotels with only mandatory fields
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<checkIn>","<checkout>","<No of Room>" and "<No of Adults>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName                   | password      | state      | city    | checkIn    | checkout   | No of Room | No of Adults |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |

  @Search3
  Scenario Outline: Search hotels without entering any fields
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    And User click Search button
    Then User should verify after search hotel error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName                   | password      |
      | virusaranraj2525@gmail.com | Saranraj@2525 |

  @Search4
  Scenario Outline: Search hotels with all fields and verify the hotel price sorting from low to high
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from low to high
    Then User should verify after sorting that price are listed from low to high

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |

  @Search5
  Scenario Outline: Search hotels with all fields and verify the hotel price sorting from high to low
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from high to low
    Then User should verify after sorting that price are listed from high to low

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |

  @Search6
  Scenario Outline: Search hotels with all fields and verify the hotel name in Descending order
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from Descending order
    Then User should verify after sorting that name in Descending order

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |

  @Search7
  Scenario Outline: Search hotels with all fields and verify the hotel name in Ascending order
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User click sort from Ascending order
    Then User should verify after sorting that name in Ascending order

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |

  @Search8
  Scenario Outline: Search hotels with all fields and select all room type
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName                   | password      | state      | city    | roomType                            | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |

  @Search9
  Scenario Outline: Search hotels with all fields
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should verify all hotel listed in the selected room type "<roomType>"

    Examples: 
      | userName                   | password      | state      | city    | roomType                            | checkIn    | checkout   | No of Room | No of Adults | No of Childs |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            2 |
      
      