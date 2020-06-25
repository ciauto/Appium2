package examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DemoVirtualDeviceBrowser {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void test() throws MalformedURLException, InterruptedException 
	{
	DesiredCapabilities cap=DesiredCapabilities.android();	
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AndroidDriver<AndroidElement>(url, cap);
	driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
	driver.get("http://www.twoplugs.com");
	Thread.sleep(4000);
	
	
	}
}
