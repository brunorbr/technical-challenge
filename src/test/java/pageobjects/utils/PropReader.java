package pageobjects.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

    private Properties testProps;

    public PropReader(String propFile) {
        this.testProps = new Properties();
        try {
            testProps.load(new FileInputStream(propFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBaseURL(){
        return testProps.getProperty("base_url");
    }

    public String getUsername(){
        return testProps.getProperty("username");
    }

    public String getPassword(){
        return testProps.getProperty("password");
    }

    public Double getTshirtBaseValue(){
        return Double.parseDouble(testProps.getProperty("base_tshirt_value"));
    }
}