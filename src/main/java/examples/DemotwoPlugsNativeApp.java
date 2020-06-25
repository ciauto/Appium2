package examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DemotwoPlugsNativeApp {

	@Test
	public void test() throws MalformedURLException 
	{
	
	DesiredCapabilities cap=DesiredCapabilities.android();	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
	cap.setCapability("appPackage", "com.twoplugs.mobile");
	cap.setCapability("appActivity", "CordovaApp");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
	driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
	
	  List<AndroidElement> loging = driver.findElements(By.className("android.view.View"));
	  System.out.println(loging);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
