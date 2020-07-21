package com.VyTruck.pages;

import com.VyTruck.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
