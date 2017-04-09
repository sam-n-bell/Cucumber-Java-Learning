$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/features/storeDemoQaFeatures.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sam Bell - bell.sam@Outlook.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Demo of using Cucumber with Java"
    },
    {
      "line": 3,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 4,
      "value": "#When: Some key actions"
    },
    {
      "line": 5,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 6,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 7,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 8,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 9,
      "value": "#| (Data Tables)"
    },
    {
      "line": 10,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 11,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 12,
      "value": "#\"\""
    },
    {
      "line": 13,
      "value": "## (Comments)"
    },
    {
      "line": 14,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 15,
  "name": "I can use store.demoqa.com",
  "description": "",
  "id": "i-can-use-store.demoqa.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 17,
  "name": "Reach Login Page",
  "description": "",
  "id": "i-can-use-store.demoqa.com;reach-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on store.demoqa.com",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on My Account",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I expect to see a login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.navigateToDemoQA()"
});
formatter.result({
  "duration": 9345647227,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickOnMyAccount()"
});
formatter.result({
  "duration": 1771668951,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.checkForLoginScreen()"
});
formatter.result({
  "duration": 88927640,
  "status": "passed"
});
formatter.after({
  "duration": 1146814494,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Add iphone to cart and check subtotal price",
  "description": "",
  "id": "i-can-use-store.demoqa.com;add-iphone-to-cart-and-check-subtotal-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I am on store.demoqa.com",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I go to the iPhone product page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I add iPhone 4S 16GB to cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I expect to see a subtotal of \u003cvalue\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "i-can-use-store.demoqa.com;add-iphone-to-cart-and-check-subtotal-price;",
  "rows": [
    {
      "cells": [
        "value"
      ],
      "line": 30,
      "id": "i-can-use-store.demoqa.com;add-iphone-to-cart-and-check-subtotal-price;;1"
    },
    {
      "cells": [
        "$270.00"
      ],
      "line": 31,
      "id": "i-can-use-store.demoqa.com;add-iphone-to-cart-and-check-subtotal-price;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Add iphone to cart and check subtotal price",
  "description": "",
  "id": "i-can-use-store.demoqa.com;add-iphone-to-cart-and-check-subtotal-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I am on store.demoqa.com",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I go to the iPhone product page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I add iPhone 4S 16GB to cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I expect to see a subtotal of $270.00",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.navigateToDemoQA()"
});
formatter.result({
  "duration": 9163192200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.navigateToIphoneProductPage()"
});
formatter.result({
  "duration": 2132354309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.addIphone4s16GigsToCart()"
});
formatter.result({
  "duration": 187362958,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.goToCheckOut()"
});
formatter.result({
  "duration": 2803366076,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$270.00",
      "offset": 30
    }
  ],
  "location": "StepDefinitions.checkSubtotal(String)"
});
formatter.result({
  "duration": 74326428,
  "status": "passed"
});
formatter.after({
  "duration": 772781420,
  "status": "passed"
});
});