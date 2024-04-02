package RunnerFile;

import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
 
//@RunWith(Cucumber.class)
 
@CucumberOptions(
		features = "Features",
		glue = "StepDefination",
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
 
public class Apollo247{
 
}