Feature: validate checkout page with all data set

  @validCheckout
  Scenario Outline: validate checkout page with valid data
    Given open browser as "<BROWSER>"
    When enter url as "<URL>"
    And enter user name as "<USERNAME>"
    And enter password as "<PASSWORD>"
    When click login button
    But dont click remember password
    Then validate welcome page as "<MESSAGE>"

    Examples: 
      | BROWSER | URL          | USERNAME | PASSWORD  | MESSAGE          |
      | chrome  | sample url a | user1    | password1 | welcome vcentry1 |
      | firefox | sample url b | user2    | password2 | welcome vcentry2 |
      | chrome  | sample url c | user3    | password3 | welcome vcentry3 |
      | firefox | sample url d | user4    | password4 | welcome vcentry4 |
      | ie      | sample url e | user5    | password5 | welcome vcentry5 |
