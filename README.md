# clickme-app-test

Cross platform automation test for iOS and Android using [Appium](https://github.com/appium/appium) Server and [appium-java-client](https://github.com/appium/java-client) apis.

## About

The tests use [PageObjects](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) as interfaces with implementations for both platforms. Spring with java-config loads the PageObjects, AppiumDriver, and Capabilities for the desired platform. This approach requires only a single test class for both platform, giving the app's UI is identical

## Running the tests

````bash
gradle -Dapp.platform=[ios,android] clean test
````

## Options
All command line options are java system properties and loaded passed with `-D `

| options   |      descritopn      |  default | platform | required |
|-----------|:---------------------|:--------:|:--------:|:---------|
| app.platform | paltform to run tests on | n/a | ios, android | yes |
| appium.home |    location of appium   |  /usr/local/lib/node_modules/appium | ios, android | no |
| avd | android emulator  |  n/a | android | no |