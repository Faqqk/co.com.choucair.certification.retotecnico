#Author: Facundo
  @stories
  Feature: Technical Challenge
    As a user, i want to register in the page Utest.com
    @scenario1
    Scenario: Register on a page
      Given than ricardo wants to register on utest
      When he introduces his information
      |strName|strLastName|strEmail              |strBMonth|strBDay|strBYear|strCity    |strZip|strCountry|strDevice|strModel    |strOS        |strPass         |
      |Ricardo|Morad      |rm3prueba@hotmail.com |October  |13     |1999    |Panama City|00    |Panama    |Samsung  |Galaxy Ace 2|Android 4.0.1|retoTecnico2022*|
      Then he can register on utest
      |strEmail            |
      |rm3prueba@hotmail.com|
