$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "A user should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nodir"
    }
  ]
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "imm10@info.com",
        "inventorymanager"
      ]
    },
    {
      "cells": [
        "salesmanager15@info.com",
        "salesmanager"
      ]
    },
    {
      "cells": [
        "expensesmanager10@info.com",
        "expensesmanager"
      ]
    },
    {
      "cells": [
        "posmanager10@info.com",
        "posmanager"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nodir"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"imm10@info.com\" and \"inventorymanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.theUserEntersAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nodir"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"salesmanager15@info.com\" and \"salesmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.theUserEntersAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nodir"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"expensesmanager10@info.com\" and \"expensesmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.theUserEntersAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nodir"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"posmanager10@info.com\" and \"posmanager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.theUserEntersAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.upgenix.step_definitions.LoginStepDefs_Nodir.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});