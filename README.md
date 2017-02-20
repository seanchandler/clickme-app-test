# clickme-app-test

Cross platform automation for iOS and Android using [Appium](https://github.com/appium/appium) Server and [appium-java-client](https://github.com/appium/java-client) apis.

## About
The project takes a platform agnostic approach to mobile testing using the [PageObject](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) model. Platform specific resources; PageObjects, AppiumDriver, and Capabilities are loaded with Spring. A Spring config exists for each platform and is loaded into the ApplicationContext at runtime using `-Dapp.platform=[ios,android]`.

The software under test is a simple mobile app. It has a button that when clicked displays an alert. 

SourceCode for the mobile app

* [iOS](https://github.com/seanchandler/clickme-ios-app)
* [Android](https://github.com/seanchandler/clickme-android-app)

## Running the tests

Appium is a [node.js](https://github.com/nodejs) server and requires node to be installed, The easiest way to install is with [Homebrew](https://brew.sh/) (Mac OS)

````bash
brew install node
````

Install the [Appium](https://github.com/appium/appium) Server.

````bash
npm install appium -g
````

MAC OS and Xcode is required for running the app on iOS simulator. Since running the iOS app on an iPhone requires a development license it's been excluded from the example's instructions.

Android SDK and `ANDROID_HOME` environment variable is required for android. Either an emulator or a real device wil be needed to load the app.

Run the project tests from the command line

````bash
gradle -Dapp.platform=[ios,android] clean test
````

The test will manage starting and stopping the appium server and assumes appium is installed to `/usr/loca/lib/node_modules/appium`.


## Options
All command line options are java system properties and loaded passed with `-D `

| options   |      descritopn      |  default | platform | required |
|-----------|:---------------------|:--------:|:--------:|:---------|
| app.platform | paltform to run tests on | | ios, android | yes |
| appium.home |    location of appium   |  /usr/local/lib/node_modules/appium | ios, android | no |
| android.avd | android emulator to launch before running tests  | | android | no |