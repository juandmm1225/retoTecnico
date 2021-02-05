#Autor: Juan David Moreno Muñoz

@stories
Feature: : Utest
  As user, I want to sign up on uTest

  @scenario1
  Scenario: sign up on Utest
    Given than juan wants to sign up on utest
      |strFirstName   | strLastName  | strEmailAddress        | strDateOfBirth   |strDay |strYear| strCity   | strZipCode | strPassword | strPasswordConfirm |
      |Juan           | Moreno       | juancholo11@hotmail.es | September        |7      |1994   | Manizales | 170001     | 123.Asdf1225| 123.Asdf1225       |
    When he get a welcome message
      |strPased         |
      |Welcome          |
    Then he get access
      |strPased         |
      |Welcome          |