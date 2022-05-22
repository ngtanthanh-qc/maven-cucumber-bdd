@feaB
Feature: Homepage display

  @feaB_scn01
  Scenario: Homepage display -> Scenario 1
    Given Open Facebook Web Application
    When Login Email and Password
    And Click Login button
    Then Homepage title is displayed
