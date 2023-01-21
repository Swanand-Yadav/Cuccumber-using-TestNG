package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenario.txt",glue="stepDefinations",monochrome=true,
plugin= {"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestNGtestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}

/*
 * It will trigger only failed test case from TestNgRunner(It contain all tests and which is failed those
 * will fall here in text file and this text file mentioned in Failed TestCaseRunner to run only fail 
 * test case) 
 *
*/