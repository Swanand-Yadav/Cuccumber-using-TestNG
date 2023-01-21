package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations",monochrome=true,
plugin= {"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenario.txt"})
public class TestNGtestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
/* Above TestNGtestRunner class code can be blank then we can not achieve parallel mode if not then parallel
 * 
 *
 * tags="@PlaceOrder or @OffersPage" <-- If we want to run either one of them or both, and if we don't
 * any tags then it will consider all scenario.
 *
*/