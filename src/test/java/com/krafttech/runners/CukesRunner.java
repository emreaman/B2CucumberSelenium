package com.krafttech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun = false,
        tags ="@login or @SDET"
        )





public class CukesRunner {
}
