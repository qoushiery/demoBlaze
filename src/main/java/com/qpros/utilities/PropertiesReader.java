package com.qpros.utilities;

import com.qpros.utilities.DataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader implements DataReader {

    String filePath;

    public PropertiesReader(String path) {
        this.filePath = path;
    }

    public String readValueUsingKey(String key) {
        return getPropertyUsingKey(key).trim();
    }

    //Loading the properties file
    private String getPropertyUsingKey(String key) {
        FileInputStream inputStream = null;
        Properties property = new Properties();
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Properties File can't be located");
        }

        try {
            property.load(inputStream);
        } catch (IOException e) {
            System.out.println("Properties File can't be loaded");
        }

        //to get the value by the Key
        return property.getProperty(key);
    }
}
