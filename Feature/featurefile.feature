Feature: Registration
@Data-driven
Scenario: Login
Given user on home page
When click on signin
And enter userName as "lalitha"
And enter password as "Password123"
Then click on login

