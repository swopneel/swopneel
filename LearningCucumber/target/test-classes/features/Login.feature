#Author: swopneelg@gmail.com

Feature: Automating the Login page

 @login
Scenario: To validte the login functionality with correct username and pw
    Given Open the Browser
    And Enter the URL
    When Click on the My Account icon
    And Click on the login link
    When Enter correct email
    And Enter correct pw 
    And Click on login button
    Then Validate the login status
    And Close the browser

@login
Scenario: To validte the login functionality with correct username and pw
    Given Open the Browser
    And Enter the URL
    When Click on the My Account icon
    And Click on the login link
    When Enter correct email as "jason.roger@gmail.com"
    And Enter correct pw as "test@1234"
    And Click on login button
    Then Validate the login status
    And Close the browser
    
 @login   
Scenario: To validte the login functionality with correct username and pw
    Given Open the Browser
    And Enter the URL
    When Click on the My Account icon
    And Click on the login link
    When Fill the login credentials
    |ben.fletcher@gmail.com|test@1234|Ben|Fletcher|
    And Click on login button
    Then Validate the login status
    And Close the browser
 
 
 @loginWithDATA   
Scenario Outline: To validte the login functionality with correct username and pw
    Given Open the Browser
    And Enter the URL
    When Click on the My Account icon
    And Click on the login link
    When Enter correct <email> as username
    And Enter correct <pw> as password
    And Click on login button
    Then Validate the login status
    And Close the browser  
    
    Examples:
    |email|pw|
    |jason.roger@gmail.com|test@1234|
    |kerrie.wright@gmail.com|test@1234| 
    |ben.fletcher@gmail.com|test@1234|
    