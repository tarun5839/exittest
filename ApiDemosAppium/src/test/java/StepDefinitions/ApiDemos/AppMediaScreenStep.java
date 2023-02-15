package StepDefinitions.ApiDemos;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import AppBaseClass.ApiDemos.AppiumTestBase;
import AppScreens.ApiDemos.ContentScreen;
import AppScreens.ApiDemos.MediaScreen;
import AppScreens.ApiDemos.PrefrencesScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppMediaScreenStep extends AppiumTestBase {

	AppiumTestBase Testclasobj =new AppiumTestBase(); 	                      //------- EXTENDING BASE FILE------//
	public PrefrencesScreen prefrence  = new PrefrencesScreen (wd);           
	public ContentScreen content  = new ContentScreen (wd);                    //------ OBJECT PAGEFACTORY ------// 
	public MediaScreen media = new MediaScreen(wd);
	
	private static Logger log = LogManager.getLogger(AppMediaScreenStep.class);    //----- LOGGER IMPLEMENTED -----//
	
          //  ----------- Test Case -3  To Test Audio Player button Functionality  --------------------
	 
	@Given("^I am on the First Screen and Click on the Media btn$")                     //---- WAITING FOR APP TO LOAD -----//
	public void i_am_on_the_First_Screen_and_Click_on_the_Media_btn() throws Throwable {
	    
		log.info("*****************************************************"); 
		media.mediabt();
	    
	}

	@When("^I click Mediaplayer btn$")
	public void i_click_Mediaplayer_btn() throws Throwable {
	   
		media.mediaplayerbt();
	}

	@When("^I Click on Playaudio From src$")
	public void i_Click_on_Playaudio_From_src() throws Throwable {
	    
	    media.playaudiobt();
	}

	@Then("^I Should be Able To see the Playing Audio Screen$")
	public void i_Should_be_Able_To_see_the_Playing_Audio_Screen() throws Throwable {
	  
		Thread.sleep(2000);
		Assert.assertTrue(media.audioscreendispalyed());       //------ ASSERTING THE STATEMENTS ------//
		Thread.sleep(2000);
	   
	}
	
	
               //  ----------- Test Case -2 To Test Audio FX Working in Application --------------------

	@When("^I click on the  AudioFx btn$")
	public void i_click_on_the_AudioFx_btn() throws Throwable {
	    
		log.info("***********************************************************"); 
		media.audiofxbt();
	}

	@When("^I click on VideoPlayer from local file$")
	public void i_click_on_VideoPlayer_from_local_file() throws Throwable {
	  
		log.info("*****VideoPlayer**********"); 
	}
	
	@Then("^I validate that Audio is playing$")
	public void i_validate_that_Audio_is_playing() throws Throwable {
	   
	   
		Assert.assertTrue(media.audiodispalyed());             //------ ASSERTING THE STATEMENTS ------//
	}
	

              //  ----------- Test Case - 3   To Test Video playing visibility  --------------------
	
	

	@When("^I click Mediaplayer btn of app$")
	public void i_click_Mediaplayer_btn_of_app() throws Throwable {
	  
		log.info("***********************************************************"); 
		media.mediaplayerbt();
	}
	

	@When("^I click on VideoPlayer from file$")
	public void i_click_on_VideoPlayer_from_file() throws Throwable {
	  
	    media.videobt();
	}
	
	@Then("^I validate that Video is playing$")
	public void i_validate_that_Video_is_playing() throws Throwable {
	   
		
		Assert.assertTrue(media.videodispalyed());           //------ ASSERTING THE STATEMENTS ------//
		Thread.sleep(3000);
	}
	
}
