package AppScreens.ApiDemos;

import org.openqa.selenium.support.PageFactory;
import AppBaseClass.ApiDemos.AppiumTestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ViewScreen extends AppiumTestBase {	
	
	//--------------------------------- PAGE FACTORY DRIVER DEFINE -------------------------
	public ViewScreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	
	
	// ------------------------------  MOBILE ELEMENTS LOCATORS ----------------------------
	
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]\r\n")
	 MobileElement Viewsbtn ;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	 MobileElement Searchviewbtn ;
	 
	 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]\r\n")
	 MobileElement Filterbtn;
	 
	 @AndroidFindBy(id = "android:id/search_src_text")
	 MobileElement SearchtextArea ;
	 
	 @AndroidFindBy(id = "com.hmh.api:id/list_view")
	 MobileElement TextAns ;
	 
	 
	// --------------------------- METHODS FOR TEST--------------------------------- 
	
	 public boolean textdisplayed() {

			return TextAns.isDisplayed();

		}
		public void textinput(String TestText) {

			SearchtextArea.sendKeys(TestText);

		}	
		
		public void filterbtn() {
			Filterbtn.click();
		}
	
		public void searchbtn() {
			Searchviewbtn.click();
		}
	
		public void viewbtn() {
			Viewsbtn.click();
		}
		


}
