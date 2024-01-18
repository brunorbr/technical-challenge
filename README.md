# Test Automation Tecnhical Challenge
This automated test suite, composed by two tests for the https://saucedemo.com web pages was developed using the frameworks:

[Selenium 4.16.1](https://selenium.dev)

[jUnit 5.10.1](https://junit.org)

Together with the Java Programming language.

Since Maven is the dependency manager, you will need it installed on your machine to run the tests.

The automated tests developed in this repository are available for execution on:

Google Chrome

```mvn test -Dbrowser="chrome"```


Firefox

```mvn test -Dbrowser="firefox"```

Chrome Mobile Emulator

```mvn test -Dbrowser="chrome-mobile"```

If the parameter is left empty or there is an invalid input, the tests will run om Chrome by default.