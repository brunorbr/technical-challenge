package pageobjects.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

    Properties testProps;

    public PropReader(String propFile) throws IOException {
        this.testProps = new Properties();
        testProps.load(new FileInputStream(propFile));
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
}