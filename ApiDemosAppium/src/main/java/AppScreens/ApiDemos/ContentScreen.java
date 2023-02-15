package AppScreens.ApiDemos;

import org.openqa.selenium.support.PageFactory;

import AppBaseClass.ApiDemos.AppiumTestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContentScreen extends AppiumTestBase {

	//--------------------------------- PAGE FACTORY DRIVER DEFINE -------------------------
	public ContentScreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	// ------------------------------  MOBILE ELEMENTS LOCATORS ----------------------------
	 
	 @AndroidFindBy(id = "android:id/text1")
	 MobileElement readassetbtn ;
	 
	 @AndroidFindBy(id = "com.hmh.api:id/text")
	 MobileElement texttitle;
	 	 
	 @AndroidFindBy(id = "android:id/text1")
	 MobileElement pickcontact ;
	 
	 @AndroidFindBy(id = "com.hmh.api:id/pick_contact")
	 MobileElement pickcontactbtn;
	 
	 @AndroidFindBy(id = "com.android.documentsui:id/artwork")
	 MobileElement contactpage ;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	 MobileElement contentbtn ;
	
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	 MobileElement assetsbtn;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	 MobileElement providerbtn ;


	 // --------------------------- METHODS FOR TEST--------------------------------- 
		public boolean contactpagedisplayed() {

			return contactpage.isDisplayed();

		}
		public boolean assettextdispalyed() {
			return texttitle.isDisplayed();

		}
			
		public void contentbt() {
			contentbtn.click();
		}	
	
		public void assetbt() {
			assetsbtn.click();
		}	
	
		public void readassetbt() {
			readassetbtn.click();
		}	
	
		
		public void providerbt() {
			providerbtn.click();
		}	
		
		public void cntctbt() {
			pickcontact.click();
		}	
		
		public void cntctbxbt() {
			pickcontactbtn.click();
		}	
	
}
