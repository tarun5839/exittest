package AppScreens.ApiDemos;

import org.openqa.selenium.support.PageFactory;

import AppBaseClass.ApiDemos.AppiumTestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MediaScreen extends AppiumTestBase  {
	
	//--------------------------------- PAGE FACTORY DRIVER DEFINE -------------------------
	public MediaScreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
		
	}
	
	// ------------------------------  MOBILE ELEMENTS LOCATORS ----------------------------
	
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	 MobileElement mediabtn ;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	 MobileElement audiofxtbtn ;
	
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	 MobileElement audiofxscreen ;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 MobileElement mediaplayerbtn ;
	
	 @AndroidFindBy(id = "com.hmh.api:id/localvideo")
	 MobileElement playvideotbtn ;
	
	 @AndroidFindBy(id = "com.hmh.api:id/surface")
	 MobileElement playingvideoscreen ;
	
	 @AndroidFindBy(id = "com.hmh.api:id/resourcesaudio")
	 MobileElement playaudiobtn ;
	
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 MobileElement playingaudioscreen ;
	
	 
	// --------------------------- METHODS FOR TEST--------------------------------- 
	 
		public boolean audiodispalyed() {
			return audiofxscreen.isDisplayed();

		}
		
		public boolean videodispalyed() {
			return  playingvideoscreen.isDisplayed();

		}
		
		public boolean audioscreendispalyed() {
			return  playingaudioscreen.isDisplayed();

		}
		
		
		public void mediabt() {
			mediabtn.click();
		} 
	 
		public void audiofxbt() {
			audiofxtbtn.click();
		} 
	 
		
		public void mediaplayerbt() {
			mediaplayerbtn.click();
		} 
	 
		public void videobt() {
			playvideotbtn.click();
		} 
	 
		public void playaudiobt() {
			playaudiobtn.click();
		} 
		
		
}
