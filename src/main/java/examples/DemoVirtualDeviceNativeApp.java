package examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class DemoVirtualDeviceNativeApp {

	@Test
	public void test() throws MalformedURLException 
	{
	
	DesiredCapabilities cap=DesiredCapabilities.android();	
	//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	cap.setCapability("appPackage", "io.selendroid.testapp");
	cap.setCapability("appActivity", ".HomeScreenActivity");
	
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
	
	
	driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Naresh Prajapati");
	
	driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
