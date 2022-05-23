Feature: signup
Scenario: signUp is successfully
Given user launch the Firefox browser
When user opens url ""
And click on profile
And click on signIn
And user enters Email as "dagurkapil56922@@gmail.com" and password as "Kapil@12345"
And click on signup
Then close browser


