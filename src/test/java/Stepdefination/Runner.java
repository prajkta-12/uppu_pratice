package Stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue= {"Stepdefination"},tags= "@Data-driven")

public class Runner {
	

}
