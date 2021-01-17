
Feature: Search
   As an end user
   I want do search for product
   So that i can view products of my choice

 @rk
  Scenario: do search
     Given Iam on a homepage
     When I do a search for product "puma"
     Then I should see respective products

  @Regression @Pre-Prod
  Scenario: do search
    Given Iam on a homepage
    When I do a search for product "nike"
    Then I should see respective products
