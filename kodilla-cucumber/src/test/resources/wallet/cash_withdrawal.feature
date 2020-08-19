Feature: Cash Withdrawal
    Scenario: Successful withdrawal from a wallet in credit
        Given I have deposited $200 in my wallet
        When I request $30
        Then $30 should be dispensed

    Scenario: Not successfyl withdrawal from a wallet in credit
    Given I have deposited $30 in my wallet
    When I request $40
    Then it shouldn't be dispensed