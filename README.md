# demoBlaze
This framework is built using Page Object Model (POM) and consists of 3 pages in a Maven project using Selenium web driver and TestNG as a Framework written with Java language.

The three pages are the homepage, product Details page, and Cart Listing Page. there are 5 use cases that exist on the Framework
First Test Case "TestUserRegistrationAndLogin" for user registration flow then logging into the website with the same registered credentials.

Second Test Case "TestCategoriesHaveItems" checking that all categories have items.
The third Test Case "TestAddRandomItemToCart" makes a random selection from the products list without entering any specific product.

Fourth Test Case "TestRemoveItemFromCart" that removes the first listed item in the cart
Fifth Test Case "TestSuccessCheckoutWithRandomItem" is considered as an End to End test case as it takes the flow starting from [Adding a random item to the cart - then placing the order to checkout - completing the payment - getting back to the home page - logging out from the account]

All the test cases are added to the TestNG XML file called "AllTestCases.xml"

all test cases have the necessary validations and assertions to make sure that the correct actions have been reflected

**#Framework classes and their functionality**

ElementActions Class

This Class contains all actions we need to interact with any web element that exists in the dom and all methods are implemented using the selenium library with its methods and all contained methods are implemented to be directly used by the user to create his own test case without any need to know info about selenium before Just call the ElmentActions class in your test and use their methods

BrowserActions Class

This Class contains all actions we need to interact with the browser and all methods are implemented using the selenium library with its methods and all contained methods are implemented to be directly used by the user to create his own test case without any need to know info about selenium before Just call the BrowerActions class in your test and use their methods

DriverHandler

This class handles all the initialization we need for any selected web driver (Chrome, Firefox and Edge)

Config.properties

This File is a config file contains all data you will need to use in your tests

ReadConfigPropertiesFile

This class is used to read our config file "Config.properties"

#Test Classes and their functionality

Locators Package

This package is considered a repository of static locators that we have in the system to be used to create any method needed for building our test case the locators are divided into separate classes based on their page location

Strings Package

This package is considered a repository of static strings that we have in the system to be used to create any method needed for building our test case the locators are divided into separate classes based on their page location

Pages Package

As we mentioned before the framework follows the POM design pattern so each page we have in the system has its own class and each page class contains the methods we need to interact with this page

Test Package

This package contains the tests we build End to End to be used in any suite
