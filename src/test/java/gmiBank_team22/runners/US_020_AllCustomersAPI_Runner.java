package gmiBank_team22.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        glue = "gmiBank_team22/step_Definitions",
        plugin = {
             "html:target/default-cucumber-reports",
             "json:target/json-reports/cucumber.json",
             "junit:target/xml-report/cucumber.xml"
        },
        tags ="@TC_001_AllCustomersData" ,
        dryRun = false


)
public class US_020_AllCustomersAPI_Runner {
}
