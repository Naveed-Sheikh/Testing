$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/2Addproduct.feature");
formatter.feature({
  "name": "Add Product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addproduct"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add Product with valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter valid username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user navigates to homepage",
  "keyword": "And "
});
formatter.step({
  "name": "user click on menu",
  "keyword": "And "
});
formatter.step({
  "name": "click on catalog",
  "keyword": "And "
});
formatter.step({
  "name": "click on manufactures",
  "keyword": "And "
});
formatter.step({
  "name": "user is on manufacture details page",
  "keyword": "And "
});
formatter.step({
  "name": "click on Add button",
  "keyword": "And "
});
formatter.step({
  "name": "enter manufactures details name \"\u003cname\u003e\" url \"\u003curl\u003e\" sort \"\u003csort\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user is on manufacture page with success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "name",
        "url",
        "sort"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin@123",
        "Pepe Jeans",
        "www.pepejeans.com",
        "3"
      ]
    }
  ]
});
formatter.background({
  "name": "Background section",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Product with valid details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addproduct"
    }
  ]
});
formatter.step({
  "name": "user enter valid username \"admin\" and password \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to homepage",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_navigates_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on menu",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_on_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on catalog",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_catalog()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manufactures",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_manufactures()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on manufacture details page",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_is_on_manufacture_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter manufactures details name \"Pepe Jeans\" url \"www.pepejeans.com\" sort \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.enter_manufactures_details_name_url_sort(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on manufacture page with success message",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_manufacture_page_with_success_message()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cSuccess: You have [modifi]ed manufacturers!\n×\u003e but was:\u003cSuccess: You have [add]ed manufacturers!\n×\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefination.login.user_is_on_manufacture_page_with_success_message(login.java:131)\r\n\tat ✽.user is on manufacture page with success message(file:src/test/java/feature/2Addproduct.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});