package StepDefinitions.ApiDemos;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import AppBaseClass.ApiDemos.AppiumTestBase;
import AppScreens.ApiDemos.PrefrencesScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppPrefrencesScreenStep extends AppiumTestBase {

	
	AppiumTestBase Testclasobj =new AppiumTestBase();       //------- EXTENDING BASE FILE------//
	
	private static Logger log = LogManager.getLogger(AppPrefrencesScreenStep.class);    //------ OBJECT PAGEFACTORY ------// 
	
    public PrefrencesScreen prefrence  = new PrefrencesScreen (wd);   //----- LOGGER IMPLEMENTED -----//
    
    
//  ----------- Test Case -1  To check XML Text input in the Box  --------------------
	
	@Given("^I am on the First Screen of the Apidemos Application$")        //---- WAITING FOR APP TO LOAD -----//
	public void i_am_on_the_First_Screen_of_the_Apidemos_Application() throws Throwable {
		
		log.info("***********************************************************"); 
	}

	@Given("^I click on the Prefrence btn$")
	public void i_click_on_the_Prefrence_btn() throws Throwable {
		
		prefrence.refrencebtn();
	}

	@When("^I click  Prefrence from Xml btn and select the EditText box$")
	public void i_click_Prefrence_from_Xml_btn_and_select_the_EditText_box() throws Throwable {
		
		prefrence.xmlbtn();
		prefrence.textbox(); 
		
	}

	@When("^I Enter the Details \"([^\"]*)\" and submit$")
	public void i_Enter_the_Details_and_submit(String Text) throws Throwable {
		
		prefrence.textinput(Text);
		prefrence.submitbtn();
	}

	@Then("^I should see the  Prefrences list$")
	public void i_should_see_the_Prefrences_list() throws Throwable {
		
		Assert.assertTrue(prefrence.titledisplayed());                  //------ ASSERTING THE STATEMENTS ------//
	}
	

	
}
