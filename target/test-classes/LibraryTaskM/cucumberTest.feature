Feature: Metro 2033
  Is the book selected Metro 2033?

  Scenario: Choosing the correct book
    Given The book is Metro 2033
    When I ask whether the book is Metro 2033
    Then I should be told yes
