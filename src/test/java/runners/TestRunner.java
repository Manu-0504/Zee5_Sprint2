package runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src/test/java/features" ,glue="steps",publish = true,
        plugin = { "pretty", "html:target/cucumber-reports.html"},
        monochrome = true,tags = "@smoke")//, tags = "@smoke"

public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][]scenarios(){
        return super.scenarios();//"json:target/cucumber-reports.json"

    }

}
