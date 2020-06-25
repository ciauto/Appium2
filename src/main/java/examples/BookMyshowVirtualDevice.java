package examples;

import java.io.File;
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

public class BookMyshowVirtualDevice {

	@Test
	public void Login() throws MalformedURLException, InterruptedException {
		File appDir = new File("C:\\eclipse-workspace-201906\\Appium2\\src\\main\\java\\");
		File app = new File(appDir, "bookMyShow-ucb.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus4");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		List<AndroidElement> a = driver.findElements(By.className("android.widget.EditText"));
		a.get(0).sendKeys("busyQA");
		a.get(1).sendKeys("Mobile");
		a.get(2).sendKeys("appium@training");
		a.get(3).sendKeys("password");
		driver.findElementById("com.bt.bms:id/action_icon").click();
		driver.closeApp();
	}

}
