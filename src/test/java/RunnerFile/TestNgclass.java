package RunnerFile;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Features",
		glue = "StepDefination",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
				plugin={"pretty","json:target/cucumberReports.json","html:target/cucumberReports.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			    dryRun=true
			    )

public class TestNgclass extends AbstractTestNGCucumberTests{

}

