Feature: Shopping list

  Background: open application
    Given I open the application

#  Scenario: Add shopping list
#    When I click on add shopping list
#    And I type "First List"
#    And I click on "Add list"
#    Then I see "First List" on landing screen

  Scenario: Delete a shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on "Add list"
    And I click on "First List"
    And I click on more options
    And I click on Delete list
    And I click on DELETE LIST
    Then I check there is no "First List"
