package TestRunnerFile.ApiDemos;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

                                   // --------  FEATURE FILES  SOURCE LOCATION ------ //

	@CucumberOptions(
			features={"./src/test/java/FeatureFiles/ApiDemos/AppView.feature"
					,"./src/test/java/FeatureFiles/ApiDemos/ContentScreen.feature"
					,"./src/test/java/FeatureFiles/ApiDemos/MediaScreen.feature"
					,"./src/test/java/FeatureFiles/ApiDemos/PrefrencesScreen.Feature"},
			
			                      // --------  STEPDEFINATIONS FILES  SOURCE LOCATION ------ //
			glue = 	"StepDefinitions.ApiDemos",
			
					                        // --------  TESTCASES TAGS  ------ //
			
			tags = {"@ContentScreen,@MediaScreen,@ViewScreen,@PrefrenceScreen"}
		)

	public class AppRunner extends AbstractTestNGCucumberTests {
		

	    }

	