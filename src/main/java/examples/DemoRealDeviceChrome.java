package examples;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DemoRealDeviceChrome {

	@Test
	public void test() throws MalformedURLException 
	{
	
	DesiredCapabilities cap=DesiredCapabilities.android();	
	//execute test in Chrome browser
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	//execute test on Android Platform
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	
	//Create Object of URL class and specify the Appium server address
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
//	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_244\\chromedriver.exe");
	//Create object of AndroidDriver class and pass the url and capability
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
	
	//open site
	
	driver.get("http://facebook.com");
	
	System.out.println("Title :::"+" " +driver.getTitle());
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
