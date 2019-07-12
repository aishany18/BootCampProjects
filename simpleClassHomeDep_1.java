package homeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class simpleClassHomeDep_1 {
     public static WebDriver driver = null; 

     @FindBy(xpath = "(/html/body/div/div/div/div/div/div/div/div/div/a/div/div)[1]")
     WebElement myAccount;
     
     @FindBy(xpath = "/html/body/div/div/div/div/div/div/p[2]/a/span")
     WebElement register;
     
   @FindBy(xpath="//input[@class='form-input__field invalid']")
    WebElement emailid;
     
    @FindBy(id="registrationPassword")
     WebElement PW;
     
     @FindBy(id="zipcode")
     WebElement zipcode;
     
     @FindBy(id="phoneNumber")
     WebElement PhoneNum;
     
  //   @FindBy(linkText = "//*[@id=\"accountRegister\"]/span")
    // WebElement CreateAccount;
    // @FindBy(xpath = "[id='accountRegister']")
    // WebElement CreateAccount; 
     
     	@FindBy(id = "accountRegister")
     	WebElement CreateAccount;
    
     
    public simpleClassHomeDep_1(WebDriver driver) { // overloaded driver constructor: local driver - we dont have create our driver again and again. It will pick from our global variable
		this.driver = driver; // this key is referring to our global variable
	PageFactory.initElements(driver, this);
	
	}
    public void Account() {
    	myAccount.click();
	}
       public void Register() {
    	register.click();
    }    
      public void email(String email) {
    	emailid.sendKeys(email);
       }
     public void password(String password) {
    	  PW.sendKeys(password);
      }
      public void ZipCode(String zip) {
    	  zipcode.sendKeys(zip);
      }
      public void Phone(String phoneNum) {
    	  PhoneNum.sendKeys(phoneNum);
      }
  
   
      public void createAccount() {
    	  CreateAccount.click();
      
}

}
