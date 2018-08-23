Feature: Google Search feature
using this feature user should be able to search in internet

Scenario: User want to search information about 'Agile Methodology' by entering valid set of word

Given user is on Google home page

When user searches for 'Agile Methodology'  

Then All page links should display with 'Agile Methodology'
