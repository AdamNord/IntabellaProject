$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US19.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US19"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_enters_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US-19 Driver can create vehicle odometer Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US19"
    },
    {
      "name": "@IN-223"
    },
    {
      "name": "@IN-225"
    }
  ]
});
formatter.step({
  "name": "the user navigate to Fleet module and click on the Vehicle Odometer",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(@class,\u0027btn main-group\u0027)]\"}\n  (Session info: chrome\u003d88.0.4324.190)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NURI\u0027, ip: \u0027192.168.1.154\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\USER\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55598}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 12d0f4013b112dfa5128f6ff4456a6a1\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(@class,\u0027btn main-group\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer(US19DriverAddLicensePlate224.java:83)\r\n\tat ✽.the user navigate to Fleet module and click on the Vehicle Odometer(file:///C:/Users/USER/IdeaProjects/IntabellaProject/src/test/resources/features/US19.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should navigate to Vehicles Odometers page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_User_Should_Navigate_To_Vehicles_Odometers_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click on the Create Vehicle Odometer",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_User_Click_On_The_Create_Vehicle_Odometer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should navigate to Create Vehicle Odometer page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_should_navigate_to_Create_Vehicle_Odometer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click on the Save and Close",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_click_on_the_Save_and_Close()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Entity saved\" message should appear at the top of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.message_should_appear_at_the_top_of_the_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_enters_the_driver_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US-19 Driver can add License plate information Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US19"
    },
    {
      "name": "@IN-224"
    },
    {
      "name": "@IN-225"
    }
  ]
});
formatter.step({
  "name": "the user navigate to Fleet module and click on the Vehicle Odometer",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(@class,\u0027btn main-group\u0027)]\"}\n  (Session info: chrome\u003d88.0.4324.190)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NURI\u0027, ip: \u0027192.168.1.154\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\USER\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55644}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e32f72614930d832d0614f3297ffd471\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(@class,\u0027btn main-group\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer(US19DriverAddLicensePlate224.java:83)\r\n\tat ✽.the user navigate to Fleet module and click on the Vehicle Odometer(file:///C:/Users/USER/IdeaProjects/IntabellaProject/src/test/resources/features/US19.feature:42)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should navigate to Vehicles Odometers page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_User_Should_Navigate_To_Vehicles_Odometers_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click on the Create Vehicle Odometer",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_User_Click_On_The_Create_Vehicle_Odometer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should navigate to Create Vehicle Odometer page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_should_navigate_to_Create_Vehicle_Odometer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click on the Add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_click_on_the_Add_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should navigate to Select Carreservation page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_should_navigate_to_Select_Carreservation_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user checked the checkbox of the related license plate and click on the Select button",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_checked_the_checkbox_of_the_related_license_plate_and_click_on_the_Select_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the selected license plate should appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_selected_license_plate_should_appear_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click on the Save and Close",
  "keyword": "When "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.the_user_click_on_the_Save_and_Close()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Entity saved\" message should appear at the top of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.intabella.step_definitions.US19DriverAddLicensePlate224.message_should_appear_at_the_top_of_the_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});