package StepDefinitions.ApiDemos;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import AppBaseClass.ApiDemos.AppiumTestBase;
import AppScreens.ApiDemos.ContentScreen;
import AppScreens.ApiDemos.PrefrencesScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppContentScreenStep extends AppiumTestBase {
	
                                                                       	//------- EXTENDING BASE FILE------//
	AppiumTestBase Testclasobj =new AppiumTestBase(); 
	public PrefrencesScreen prefrence  = new PrefrencesScreen (wd);      //------ OBJECT PAGEFACTORY ------//             
	public ContentScreen content  = new ContentScreen (wd);
	
	private static Logger log = LogManager.getLogger(AppContentScreenStep.class);   //----- LOGGER IMPLEMENTED -----//
	
	//            ------ Test Case -1 To Test Assets Button Functionality -------------------
	                                                                                
	@Given("^I am on the First Screen and Click on the Content Btn$")                 //---- WAITING FOR APP TO LOAD -----//
	public void i_am_on_the_First_Screen_and_Click_on_the_Content_Btn() throws Throwable {
	   
		log.info("********************************************************"); 
	    	content.contentbt();
	}

	@Given("^I click on the assets btn$")
	public void i_click_on_the_assets_btn() throws Throwable {
	 
		    content.assetbt();
	}

	@When("^I Click on the Read Assets btn$")
	public void i_Click_on_the_Read_Assets_btn() throws Throwable {
	  
		content.readassetbt();
	}

	@Then("^I Should be Able to See the Assets Text Page$")
	public void i_Should_be_Able_to_See_the_Assets_Text_Page() throws Throwable {
	   
		Assert.assertTrue(content.assettextdispalyed());
		log.info("***********************************************************"); 
	}

	
	//    ----------- Test Case -2 To test Provider Contact Screen Visibility --------------------
	
	
	
	@Given("^I click on Provider box$")
	public void i_click_on_Provider_box() throws Throwable {
	  
		log.info("***********************************************************"); 
		content.providerbt();
	}

	@When("^I click on Pick Contact Box$")
	public void i_click_on_Pick_Contact_Box() throws Throwable {
	  
		content.cntctbt(); 
	}

	@When("^I select The  Contact btn$")
	public void i_select_The_Contact_btn() throws Throwable {
	  
	 
		content.cntctbxbt();
	}

	@Then("^I Should be able to see the Page$")
	public void i_Should_be_able_to_see_the_Page() throws Throwable {
	    
		Assert.assertTrue(content.contactpagedisplayed());             //------ ASSERTING THE STATEMENTS ------//
	}

}
