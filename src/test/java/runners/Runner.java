package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Shivam\\seleniumEclipse\\GoibiboBddFrameworkTest\\resources\\FeatureFiles\\GoibiboFlightBook.feature", //the path of the feature files
		glue={"steps"}, //the path of the step definition files
		
		format= {"pretty","html:test-outout",  "json:json_output//cucumber.json", "junit:junit_xml//cucumber.xml" //to generate different types of reporting
				},
				monochrome = true, //display the console output in a proper readable format
		dryRun = false, //to check the mapping is proper between feature file and step def file
				strict = false //it will check if any step is not defined in step definition file
						//tags = {" @RegressionTest"}
		/*,
		
		
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"
		 */		
		
		)
public class Runner {

}
