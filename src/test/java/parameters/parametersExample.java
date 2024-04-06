package parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class parametersExample {
   @Parameters({"URL"})
   @Test
   public void sampleTest1(String appurl) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(appurl);
  }
    @Parameters({"URL"})
	@Test
	public void sampleTest2(String appurl) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(appurl);
 }
}
