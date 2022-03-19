
Feature:Login Functionality
Scenario: User should login with valid credentials ibrahim


Given user is on the login page
And   user click to  "Sign in" button
And   fill the "ibrahimoztom@hotmail.com" box and Email box  and "122333" box and click to sign in button
Then  user should be able to see "Home — Conduit" page