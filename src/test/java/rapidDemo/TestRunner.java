package rapidDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\workspace\\SummerCamp\\src\\test\\java\\rapidDemo\\RegisterDemo.feature",
		glue={"rapidDemo"}
		)
public class TestRunner {

}
