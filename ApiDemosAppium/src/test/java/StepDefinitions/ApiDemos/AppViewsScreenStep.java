package StepDefinitions.ApiDemos;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import AppBaseClass.ApiDemos.AppiumTestBase;
import AppScreens.ApiDemos.ViewScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppViewsScreenStep extends AppiumTestBase{

	
	AppiumTestBase Testclasobj =new AppiumTestBase();    //------- EXTENDING BASE FILE------//
	public ViewScreen view  = new ViewScreen (wd);          
	                                                     //------ OBJECT PAGEFACTORY ------// 
	private static Logger log = LogManager.getLogger(AppPrefrencesScreenStep.class);
	
	                                                                   //----- LOGGER IMPLEMENTED -----//
	@Given("^I am on the First Screen and Click on the Views btn$")
	public void i_am_on_the_First_Screen_and_Click_on_the_Views_btn() throws Throwable {  
		
		                 //---- WAITING FOR APP TO LOAD -----//
	   
		log.info("***********************************************************"); 
		view.viewbtn();
		Thread.sleep(2000);
	}

	@When("^I swipe and Scroll Down in App$")
	public void i_swipe_and_Scroll_Down_in_App() throws Throwable {
	   
	  view.swipeandscroll(); 
	  Thread.sleep(2000);
	  view.swipeandscroll();    // CALLING SWIPE AND SCROLL FUNCTIONS
	}

	@When("^I click on the Searchview btn$")
	public void i_click_on_the_Searchview_btn() throws Throwable {
	 
		Thread.sleep(2000);
		view.searchbtn();   
	}

	@When("^I click on Filter btn$")
	public void i_click_on_Filter_btn() throws Throwable {
	  

		view.filterbtn();
	}


	@When("^I enter the \"([^\"]*)\" in the box$")
	public void i_enter_the_in_the_box(String TestText) throws Throwable {
	   
	   
		view.textinput(TestText);
	}

	@Then("^I should be able to see the Text Results on below Screen$")
	public void i_should_be_able_to_see_the_Text_Results_on_below_Screen() throws Throwable {
	    
	 
		Assert.assertTrue(view.textdisplayed());              //------ ASSERTING THE STATEMENTS ------//
	}

}
