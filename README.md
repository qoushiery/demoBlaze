# demoBlaze
this framework is build using Page Object Model (POM) consists of 3 pages in a Maven project using Selenium webdriver and TestNG as a Framework written with Java language.
the Three pages are (Homepage, product Details page, Cart Listing Page. there are 5 use cases exists on the Frame work
First Test Case "TestUserRegistrationAndLogin" for user registration flow then logging into the website with the same registered credentials.
Second Test Case "TestCategoriesHaveItems" checking that all categories have items.
Third Test Case "TestAddRandomItemToCart" that makes the a random selection from the products list without entering any specific product.
Fourth Test Case "TestRemoveItemFromCart" that removes the first listed item in the cart
Fifth Test Case "TestSuccessCheckoutWithRandomItem" is considered as an End to End test case as its takes the flow starting from [Adding a random item to the cart - then placing the order to checkout - completing the payment - get back to the home page - logging out from the account]
All the test cases are added to the testng XML file called "AllTestCases.xml"
all test cases have the neccessary validations and assertions to make sure that the correct actions have been reflected
