package expedia;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNG_ScriptExp_2 {
	public static WebDriver driver = null;

  @Test
  public void f() throws InterruptedException {
	  SimpleClassExp_1 execution = new SimpleClassExp_1(driver);
	  SoftAssert selected = new SoftAssert();   // creating object for assertion 
	  execution.allFlights();
	  execution.flyfrom();
	  execution.flyingTo();
	  Thread.sleep(3000);

	  execution.departing();
	 // Thread.sleep(2000);
	  execution.returning();
	  Thread.sleep(3000);

	  execution.searchButton();
	  execution.selecting();
	  Thread.sleep(3000);

	  execution.selectingAgain();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)");
      
	  execution.ContinueBooking();
	  execution.enterfirst("Aisha");
	  execution.enterlast("Malik");
	  execution.phoneNumber("2125376090");
	  execution.Gender();
	  execution.DateMonth();
	  execution.Day();
	  execution.year();
	  execution.Insurance();
	  execution.ccname();
	  execution.ExpDate();
	  execution.expYear();
	  execution.ccvCode();
	  execution.BillingAddress();
	  execution.City("Astoria");
	  execution.state("NY");
	  execution.zipcode("11101");
	  execution.email("monkey@yahoo.com");
	//  execution.password();    not sure why it's giving an error
	 // execution.ConfirmPW();
	// execution.completeBooking();	  
  }
@BeforeClass
  
  public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "/Users/Muhammad/Desktop/Automation/jars/chromedriver");
	driver = new ChromeDriver();
	String url = "https://www.expedia.com/";
	driver.get(url);
	driver.manage().window().maximize();
	  }
}
