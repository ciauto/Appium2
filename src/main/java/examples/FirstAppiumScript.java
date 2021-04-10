package examples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstAppiumScript {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	
	File f=new File("C:\\eclipse-workspace-201906\\Appium2\\src\\main\\java");
	File fis=new File(f, "ApiDemos-debug.apk");
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
	cap.setCapability(MobileCapabilityType.APP, fis.getAbsolutePath());
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
	AndroidDriver driver = new AndroidDriver(url, cap);
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	
	driver.findElementById("android:id/checkbox").click();
	
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	
	}

}
