package pack1;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   //get command
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   String url = driver.getCurrentUrl();
   System.out.println(url);
   
   //get title-It is used to get the title of the webpage
   String title = driver.getTitle();
   System.out.println(title);
   
   //get pagesource()
    String pagesource = driver.getPageSource();
    System.out.println(pagesource);
    
    //getWindowHandle() - It is used to get the handle of a single window, It returns the string value
    String WindowHandle = driver.getWindowHandle();
    System.out.println(WindowHandle);
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
    
   //getWindowHandles()- It is used to get the handle of multiple windows, It returns the set of string-set<string>
   //set structure does not permit duplicates and does not support the index method.so,to obtain desired window handle from the set ,
   //it is necessary to use looping statement.
    Set<String> WindowHandles = driver.getWindowHandles();
    for(String window : WindowHandles) {
    	System.out.println(window);
    }
    driver.quit();
    }
}
