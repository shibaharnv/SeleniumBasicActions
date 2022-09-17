package org.shibahar;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridFInal {

    @Test
    public void testing() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        cap.setCapability(CapabilityType.BROWSER_NAME,"chrome");

        WebDriver driver= new RemoteWebDriver(new URL("http://192.168.227.179:4444"),cap);

        driver.get("https://www.google.co.in/");

    }
}
