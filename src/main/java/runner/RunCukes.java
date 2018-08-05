package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
	@CucumberOptions(features= {"src/main/java/feature/createleadoutline.feature"},
	           glue="learncucumber",
			monochrome= true,
			tags = "~@smoke")

	public class RunCukes {
		
	}
