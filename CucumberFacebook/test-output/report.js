$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the end to end feature of Facebook using the messenger feature",
  "description": "",
  "id": "testing-the-end-to-end-feature-of-facebook-using-the-messenger-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing the Messenger Feature with the valid credentials",
  "description": "",
  "id": "testing-the-end-to-end-feature-of-facebook-using-the-messenger-feature;testing-the-messenger-feature-with-the-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the Browser Is Launched and user enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters the valid  credentials \"Rajkumarerla24@gmail.com\" and \"Rajkumar8466\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "facebook Homepage displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user select the messenger icon",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select the friend",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on the like button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "close the tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select account option",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select logout option",
  "keyword": "And "
});
formatter.match({
  "location": "SendingLikeButton.the_Browser_Is_Launched_and_user_enters_the_URL()"
});
formatter.result({
  "duration": 15832640500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajkumarerla24@gmail.com",
      "offset": 40
    },
    {
      "val": "Rajkumar8466",
      "offset": 71
    }
  ],
  "location": "SendingLikeButton.the_user_enters_the_valid_credentials_and(String,String)"
});
formatter.result({
  "duration": 17061000,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.facebook.page.Login_Page.mail(Login_Page.java:46)\r\n\tat stepDefinition.SendingLikeButton.the_user_enters_the_valid_credentials_and(SendingLikeButton.java:31)\r\n\tat ✽.When the user enters the valid  credentials \"Rajkumarerla24@gmail.com\" and \"Rajkumar8466\"(Facebook.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SendingLikeButton.click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.facebook_Homepage_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.the_user_select_the_messenger_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.select_the_friend()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.click_on_the_like_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.close_the_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.user_select_account_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendingLikeButton.select_logout_option()"
});
formatter.result({
  "status": "skipped"
});
});