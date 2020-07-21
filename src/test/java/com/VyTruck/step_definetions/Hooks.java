package com.VyTruck.step_definetions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {


    @Before
    public void setUp(){
        System.out.println("Empty hook before");
    }

    @Before
    public void specialSetUp(){
        System.out.println("Special hook after\n");
    }
    @After
    public void specialTearDown(){
        System.out.println("Special hook after\n");
    }

    @After
    public void tearDown(){
        System.out.println("Empty hook after");
    }
}
