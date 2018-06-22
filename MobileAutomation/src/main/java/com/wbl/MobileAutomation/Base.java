package com.wbl.MobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AndroidDriver  driver;
  
	@Test
	public void testApp() throws MalformedURLException {
		System.out.println(System.getProperty("user.dir")); 
		File xoomApp= new File(System.getProperty("user.dir")+"/resource/xoom.android.apk");

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.VERSION, "8.0.1");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "26");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
		dc.setCapability(MobileCapabilityType.APP , xoomApp.getAbsolutePath());
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"");  // where store .apk file
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"");   //open home page 
		
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),dc);
		
	 

	}
}
