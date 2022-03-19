

Feature:Sign up Functionality


Scenario: User should create new subscription
  Given user is on the login page
  And   user click to  "Sign up"
  And   fill the username box, Email box  and Password box and click sign up button
  Then  user should be able to see "Home — Conduit" page


