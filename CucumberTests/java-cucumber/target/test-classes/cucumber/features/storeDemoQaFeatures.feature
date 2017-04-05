#Author: bell.sam@Outlook.com
#Keywords Summary : Demo of using Cucumber with Java
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: I can use store.demoqa.com

  Scenario: Reach Login Page
    Given I am on store.demoqa.com
    When I click on My Account
    Then I expect to see a login page

  Scenario: Reach Login Page
    Given I am on store.demoqa.com
    When I go to the iPhone product page
    Then I expect to see iPhone 4S listed