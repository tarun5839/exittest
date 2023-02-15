package StepDefinitions.ApiDemos;

import AppBaseClass.ApiDemos.AppiumTestBase;
import Screenshots.screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

	public class Hookes extends AppiumTestBase {
	                                       // --------  BEFORE FUNCTION ------ //
		@Before
		public void Beforeeverytestcases() {

			setup(); // ------ CALLING SETUP FUNCTION --------
		}

		                                      // --------  AFTER FUNCTION ------ //
		@After
		public void Aftereverytestcases(Scenario scenario) {

			if(scenario.isFailed()) {
				screenshot.takeScreenShot(wd, scenario.getName()); // FAILED SCREENSHOT IF SCENARIO GETS FAILED 

				}
			stopappium();  // CALLING CLOSE FUNCTION 


		}	
}
