package AppBaseClass.ApiDemos;

import java.net.URL;
import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import LAppUtilityFiles.xlsreader;
import io.appium.java_client.AppiumDriver;	
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumTestBase {                                                     //------- TEST BASE CLASS --------//

	public static AppiumDriver<MobileElement> wd  ;                              //------- ANDROID DRIVER  --------//
	static AppiumDriverLocalService service;                                    //------- DRIVER SERVICE --------//

	  
	  
	                              //-------------- DESIRED CAPABILITIES REUSABLE  -------------//
	  
	public void setup() {

		//service = AppiumDriverLocalService.buildDefaultService();
		//service.start();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		                    // ----------- UTILITY  FILE FUNCTION------------//
		
		xlsreader reader = new xlsreader("./src/main/java/LAppUtilityFiles/data.xlsx");   // CALLING EXCEL - FILE DATA 
		
		capabilities.setCapability( "platformName",reader.getCellData("appdata", 0, 2));
		capabilities.setCapability("platformVersion",reader.getCellData("appdata", 1, 2));
		capabilities.setCapability("appPackage",reader.getCellData("appdata", 2, 2));
		capabilities.setCapability("appActivity",reader.getCellData("appdata", 3, 2));
		capabilities.setCapability("deviceName",reader.getCellData("appdata", 4, 2));
		capabilities.setCapability("app",reader.getCellData("appdata", 5, 2));
		

		try {
			wd = new AppiumDriver<MobileElement>(new URL(reader.getCellData("appdata", 6, 2)),capabilities);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	                 //------- REUSABLE SCROLLING (VERTICLE/HORIZONTAL) --  TOUCH ACTIONS --------//
	
	public void swipeandscroll() {


		Dimension dimension = wd.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);
		int end_x = (int) (dimension.height * 0.1);
		int end_y = (int) (dimension.height * 0.1);	
		TouchAction touch = new TouchAction(wd);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();

	}
	
    //------- LOGGER REUSABLE FUNCTION --------//
	  
       public static Logger logger = null ;
       @BeforeTest
       public static void log4jimplement() {                                                   
       xlsreader reader = new xlsreader("./src/main/java/LAppUtilityFiles/data.xlsx");  // CALLING EXCEL - FILE DATA 
       String log4jPath = reader.getCellData("appdata", 7, 2);
       PropertyConfigurator.configure(log4jPath);
    }
	                              //------- FUNCTION CLOSING SERVER --------//
	
	public void stopappium() {
		wd.quit();
		//service.stop();
	}


}
