@BookHotel
Feature: Book Hotel

  @Book1
  Scenario Outline: Book hotel including GST-Card(debit card)-With special request
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

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type  |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool | Debit Card |

  @Book2
  Scenario Outline: Book hotel including GST-Card(credit card)-With special request
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

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        | Card Type   |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool | Credit Card |

  @Book3
  Scenario Outline: Book hotel including GST-Card(debit card)-Without special request
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
    Then User click next without adding Special Request
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type  |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card |

  @Book4
  Scenario Outline: Book hotel including GST-Card(credit card)-Without special request
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
    Then User click next without adding Special Request
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type   |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card |

  @Book5
  Scenario Outline: Book hotel without GST-Card(debit card)-With special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User click next without adding gst details
    Then User add Special Request "<Request>"
    When User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Saran     | May   | 2025 | 123 |
      | MasterCard  | 5555555555554444 | Saran     | May   | 2025 | 123 |
      | Amex        | 5555555555550000 | Saran     | May   | 2025 | 123 |
      | Discover    | 5555555555556666 | Saran     | May   | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Request        | Card Type  |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | Room with pool | Debit Card |

  @Book6
  Scenario Outline: Book hotel without GST-Card(debit card)-Without special request
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

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Card Type  |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | Debit Card |

  @Book7
  Scenario Outline: Book hotel without entering any field , book field and verify all the error message
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
    And User click credit card
    And User click submit without entering payment details
    Then User should verify after payment details error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                   |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool preference |

  @Book8
  Scenario Outline: Book hotel including GST-(UPI ID)-With special request
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
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                   | upiId                |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool preference | seleniumtraining@vbc |

  @Book9
  Scenario Outline: Book hotel including GST-(UPI ID)-Without special request
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
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | upiId                |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc |

  @Book10
  Scenario Outline: Book hotel without GST-(UPI ID)-With special request
    Given User is on the OMR branch hotel page
    When User enter "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Saran"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<checkout>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and price
    And User select the first hotel name and accept alert
    Then User should verify after select message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User click next without adding gst details
    Then User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Request        | upiId                |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com | Room with pool | seleniumtraining@vbc |

  @Book11
  Scenario Outline: Book hotel without entering any fields, book field and verify all error messages
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
    And User add Special Request "<Request>"
    And User click upi
    And User click submit without entering payment details
    Then User should verify after payment details error message "Please provide your UPI ID"

    Examples: 
      | userName                   | password      | state      | city    | roomType | checkIn    | checkout   | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                      | Enter Registration No. | Enter Company Name     | Enter Company Address | Request        |
      | virusaranraj2525@gmail.com | Saranraj@2525 | Tamil Nadu | Chennai | Standard | 2024-06-25 | 2024-06-27 | 1-One      | 3-Three      |            1 | Mr.               | Saran      | S         | 9677283425 | virusaranraj2525@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Room with pool |
