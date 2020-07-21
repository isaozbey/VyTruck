package com.VyTruck.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/VyTruck/step_definetions",
        tags = "@vehicle ",
        dryRun = false


)

public class VyTruck_Runner {
}
