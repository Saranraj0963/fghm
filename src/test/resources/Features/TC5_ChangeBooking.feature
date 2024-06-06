@ModifyBooking
Feature: Modify booking

  @Modify1
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (debit card)
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    Then User add Special Request "<Request>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings "
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type  | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool | Debit Card | 2024-05-30  |

  @Modify2
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (credit card)
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    Then User add Special Request "<Request>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool | Credit Card | 2024-05-30  |

  @Modify3
  Scenario Outline: Modify the created order id - Book hotel by (UPI ID)
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    Then User add Special Request "<Request>"
    And User enter upi details "<UPIID>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | UPIID                | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool | seleniumtraining@vbc | 2024-05-30  |

  @Modify4
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (debit card) without special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User click next without adding Special Request
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type  | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card | 2024-05-30  |

  @Modify5
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (credit card) without special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User click next without adding Special Request
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type   | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card | 2024-05-30  |

  @Modify6
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (debit card) without gst and special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User click next without adding gst and special request details
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Card Type  | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | Debit Card | 2024-05-30  |

  @Modify7
  Scenario Outline: Modify the created order id - Book hotel by Card Visa (credit card) without gst and special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User click next without adding gst and special request details
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Card Type   | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | Credit Card | 2024-05-30  |

  @Modify8
  Scenario Outline: Modify the created order id - Book hotel by (UPI ID) without special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User click next without adding Special Request
    And User enter upi details "<UPIID>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | UPIID                | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc | 2024-05-30  |

  @Modify9
  Scenario Outline: Modify the created order id - Book hotel by (UPI ID) without gst and special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User click next without adding gst and special request details
    And User enter upi details "<UPIID>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User search the order ID
    Then User should verify same booked order ID is present or not
    And User should verify same booked hotel name is present  or not
    Then User should verify same booked hotel price is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | UPIID                | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-27 | 2024-06-29 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | seleniumtraining@vbc | 2024-05-30  |

  @Modify10
  Scenario Outline: Verified modified Check-in date for existing order id
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User navigate to my Booking page
    When User search the "<order ID>"
    Then User should verify same booked order ID is present or not
    When User edit the check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | order ID   | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | SQPIT46096 | 2024-07-30  |

  @Modify11
  Scenario Outline: Verified modified Check-in date for first displayed order id
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User navigate to my Booking page
    Then User should verify after navigate to my booking page success message as "Bookings"
    When User edit the check-in Date for the first displayed order "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName                   | password      | Modify Date |
      | virusaranraj2525@gmail.com | Saranraj@2525 | 2024-07-30  |
