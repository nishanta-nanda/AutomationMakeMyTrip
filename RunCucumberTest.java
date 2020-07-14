package parallel;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
public class RunCucumberTest extends AbstractTestNGCucumberTests{

	@Override
	@Dataprovider(parallel=true)
	public object[][]scenarios(){
		return super.scenarios();
	}
}
