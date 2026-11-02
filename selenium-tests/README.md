# Selenium Test Automation Framework (Java)

UI test automation for the practice shop https://www.saucedemo.com, written in Java.

## Tools
- Java 17 or newer
- Maven
- Selenium 4
- TestNG

## What is tested
- Login: valid login and invalid login
- Cart: add an item and remove an item
- Checkout: complete an order and see the confirmation

## How to run

You need Java 17 or newer, Maven, and Google Chrome installed.

Run all tests:

```
mvn clean test
```

Run one test class:

```
mvn clean test -Dtest=CheckoutTests
```

Watch the checkout test slowly (adds a short pause after each step):

```
mvn clean test -Dtest=CheckoutTests -Dslow=true
```

## Project structure

```
src/test/java/com/vijaya/qa/
  BaseTest.java       starts and closes Chrome for every test
  BasicTests.java     simple TestNG examples
  LoginTests.java     login tests
  CartTests.java      add to cart and remove from cart
  CheckoutTests.java  checkout flow
```

## Notes
- Tests use explicit waits (WebDriverWait), not fixed sleeps.
- Chrome starts with its password manager and breach warning turned off, because that popup blocked clicks and made tests flaky.