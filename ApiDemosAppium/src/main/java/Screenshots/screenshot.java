package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class screenshot {
	public static void takeScreenShot(AppiumDriver<MobileElement> driver,String filename) {

		String screenshotFileName = System.getProperty("user.dir");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File(screenshotFileName + "/Screenshots/" + filename + ".png"));
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		}

		public static byte[] getByteScreenshot(AppiumDriver<MobileElement> driver) throws IOException
		{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
		}
	
}
