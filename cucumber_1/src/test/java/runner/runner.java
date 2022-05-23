package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\Documents\\Desktop\\Hybrid\\cucumber\\features",
glue="stepdefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:report/report.html"})

public class runner {

}
