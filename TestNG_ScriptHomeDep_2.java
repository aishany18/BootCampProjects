package homeDepot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_ScriptHomeDep_2 {
	
	public static WebDriver driver = null;	
	
  @Test
     public void f() throws InterruptedException {
	  simpleClassHomeDep_1 execution = new simpleClassHomeDep_1(driver);
	//  SoftAssert selected = new SoftAssert();   // creating object for assertion 
       execution.Account();
       Thread.sleep(2000);
       execution.Register();
   	driver.manage().window().maximize();
       execution.email("aisha78678786@gmail.com");
       Thread.sleep(2000);

       execution.password("77Ayesha67867");
       Thread.sleep(2000);

       execution.ZipCode("11102");
       Thread.sleep(2000);

       execution.Phone("2126376098");

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,100)");
    	driver.manage().window().maximize();

       Thread.sleep(2000);
       execution.createAccount();  
  
  }
  
  
 
  
  
  
  
  @BeforeClass
	 public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "/Users/Muhammad/Desktop/Automation/jars/chromedriver");
	driver = new ChromeDriver();
	String url = "https://www.homedepot.com/";
	driver.get(url);
	 }
}
