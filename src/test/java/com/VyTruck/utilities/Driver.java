package com.VyTruck.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        String browser=ConfigurationReader.getProperty("browser");

        if (browser==null){
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();

            }
        }
        return driver;
    }

}
