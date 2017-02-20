# clickme-app-test

Cross platform automation test for iOS and Android using [Appium](https://github.com/appium/appium) Server and [appium-java-client](https://github.com/appium/java-client) apis.

## About

The tests use [PageObjects](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) as interfaces with implementations for both platforms. Spring with java-config loads the PageObjects, AppiumDriver, and Capabilities for the desired platform. This approach requires only a single test class for both platform, giving the app's UI is identical

The project contains a simple ClickMe app for both iOS and Android. It has a button that when click displays an alert. 

SourceCode for the ClickMe app

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

Android SDK and `ANDROID_HOME` environment variable is required for android. Either an emulator or real devices wil be needed to load the app.

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