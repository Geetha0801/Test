package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
	@CucumberOptions(features= {"src/main/java/featuretestcases/MergeLead.feature"},
	           glue= {"learncucumber","pagesimplementation"},
			monochrome= true)

	public class RunCukes {
		
	}
