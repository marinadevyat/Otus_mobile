package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSelenideDriver implements WebDriverProvider {
  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {
    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName("Android");
    options.setDeviceName("otus");
    options.setPlatformVersion("7.1.1");
    options.setApp("/root/andy.apk");

//    options.setAppPackage("com.android.calculator2.Calculator");
//    options.setAppActivity("com.android.calculator2");

//    options.setAppPackage("com.pyankoff.andy");
//    options.setAppActivity(".MainActivity");

    try {
      return new AndroidDriver(new URL("http://45.132.17.22:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
