package com.qpros.utilities;

import java.sql.Statement;

public class ReadConfigPropertiesFile {
    public static String BASE_URL;
    public static String BROWSER_TYPE;
    public static String USER_PASSWORD;
    public static String FULL_NAME;
    public static String COUNTRY_NAME;
    public static String CITY_NAME;
    public static String CREDIT_CARD_NUMBER;
    public static String MONTH_FIELD;
    public static String YEAR_FIELD;
    public static void loadingTestsConfigurations(){
        DataReader reader = new PropertiesReader(System.getProperty("user.dir")+"/test-resources/config.properties");
        BASE_URL = reader.readValueUsingKey("baseURL").toLowerCase();
        BROWSER_TYPE = reader.readValueUsingKey("browserType").toLowerCase();
        USER_PASSWORD = reader.readValueUsingKey("userPassword");
        FULL_NAME = reader.readValueUsingKey("fullName").toLowerCase();
        COUNTRY_NAME = reader.readValueUsingKey("countryName").toLowerCase();
        CITY_NAME = reader.readValueUsingKey("cityName").toLowerCase();
        CREDIT_CARD_NUMBER = reader.readValueUsingKey("creditCardNumber").toLowerCase();
        MONTH_FIELD = reader.readValueUsingKey("monthField").toLowerCase();
        YEAR_FIELD = reader.readValueUsingKey("yearField").toLowerCase();

    }
}
