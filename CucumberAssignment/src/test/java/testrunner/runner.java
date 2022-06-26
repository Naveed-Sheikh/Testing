package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = "src/test/java/feature", 
		tags="@login,@addproduct,@editproduct,@cancelbutton,@mandatoryfield,@deleteproduct",
		glue ={"stepdefination","hooks"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome=true
		
		) 

		

public class runner {

}