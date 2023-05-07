# cucumber-java-awesomenow
 Use Selenium and cucumber to perform ServiceNow automation testing
Uses eclipse, Maven, cucumber, selenium, chromewedriver
Functionality that is getting automated
Code details
Setup

Maven test to get sunfire report
********************************
goal surefire-report:report

Setup
*****
Install Cucumber Eclipse from eclipse marketplace

Warnings
********
Unable to find version of CDP to use for . You may need to include a dependency on a specific version of the CDP using something similar to 
`org.seleniumhq.selenium:selenium-devtools-v86:4.9.0` where the version ("v86") matches the version of the chromium-based browser 
you're using and the version number of the artifact is the same as Selenium's.

//*[@id="user_name"]

References :
https://medium.com/@sonaldwivedi/installing-maven-in-eclipse-d87a39b74d44
https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/

https://mvnrepository.com/artifact/org.sonatype.nexus/nexus-plugin-testsupport/3.0.0-b2015020701

https://github.com/mfaisalkhatri/servicenow-selenium-testing
https://www.browserstack.com/guide/automation-using-cucumber-selenium
https://github.com/junit-team/junit4/wiki/Download-and-Install
https://applitools.com/blog/selenium-chrome-devtools-protocol-cdp-how-does-it-work/

https://cucumber.io/docs/tools/java/#maven
