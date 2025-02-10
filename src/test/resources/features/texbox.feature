@duban2692@gmail.com
Feature: Text Box
  As a user
  I want to use the DemoQA web application
  To interact with the elements on the page

  Scenario: The user selects the Text Box functionality
    Given that the user navigates on the "Elements" page to the "Text Box" item
    When filling out the text box
      | fullName | email          | currentAddress | permanentAddress |
      | test     | test@gmail.com | test           | test             |
    Then the information gets validated