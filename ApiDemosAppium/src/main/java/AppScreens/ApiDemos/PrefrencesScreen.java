package AppScreens.ApiDemos;

import org.openqa.selenium.support.PageFactory;

import AppBaseClass.ApiDemos.AppiumTestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrefrencesScreen extends AppiumTestBase{
	
	//--------------------------------- PAGE FACTORY DRIVER DEFINE -------------------------

		public PrefrencesScreen(AppiumDriver<MobileElement> wd) {
			PageFactory.initElements(new AppiumFieldDecorator(wd), this);
		}

		// ------------------------------  MOBILE ELEMENTS LOCATORS ----------------------------

 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
 MobileElement RefrencesButton ;
 
 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
 MobileElement Refrbyxml ;
 
 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[1]")
 MobileElement edittxtbtn ;
 
 @AndroidFindBy(id = "android:id/edit")
 MobileElement textbox ;
 
 @AndroidFindBy(id = "android:id/button1")
 MobileElement sbmtbtn ;
 
 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
 MobileElement titlexml ;
 
	

//--------------------------- METHODS FOR TEST--------------------------------- 
 
	public boolean titledisplayed() {

		return titlexml.isDisplayed();

	}
		
	public void refrencebtn() {
		RefrencesButton.click();
	}	
	
	public void xmlbtn() {
		Refrbyxml.click();
	}	
	public void textbox() {
		edittxtbtn.click();
	}
	
	
	public void textinput(String Text) {

		textbox.sendKeys(Text);

	}	
	
	public void submitbtn() {
		sbmtbtn.click();
	}	
	
	

	
	

}

