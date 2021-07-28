package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/qa/features/Login.feature", glue= {"com.qa.stepdefinition"}, dryRun = true, monochrome = true)

/*
 * -----------------------------------Cucumber options----------------------------------
 * Dryrun: It verifies if all the steps mentioned in the feature file(In our login.feature file there are 5 steps)
 *  has been written or not. so 5 steps have to be defined in the step definition file. dryRun simply verifies it.
 *  If any step/steps is/are missed then it will not run the rest of steps too.
 * 
 * Features: It simply accepts the path of the feature file in the project.
 * 
 * Glue: Where exactly the stepdefinition file is available.
 * 
 * monochrome: It provides the output in a proper readable format.
 * 
 * format: It generates the html reports or JSON report or xml report in the desired directory and make the console output pretty. 
 * 
 * Strict: It will throw the pending exception if any step is undefined/pending
 * */


public class TestRunner {

}
