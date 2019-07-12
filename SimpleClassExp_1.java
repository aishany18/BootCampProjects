package expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class SimpleClassExp_1 {
		public static WebDriver driver = null; // telling method this driver is equal to our local driver below

	// -->//input[starts-with(@aria-autocomplete,'list')][1]

		//@FindBy(xpath = "//span[contains(@class,'tab-label')]")
		//WebElement flights;
		
		@FindBy(id = "tab-flight-tab-hp")
		WebElement flights;
		
		
		@FindBy(xpath = "//input[starts-with(@aria-autocomplete,'list')][1]")
		WebElement flyingfrom;
		
		@FindBy(id = "flight-destination-hp-flight")
		WebElement flyingto;
		
		@FindBy(id = "flight-departing-hp-flight")
		WebElement depart;
		
		@FindBy(id = "flight-returning-hp-flight")
		WebElement Return;
		
//		@FindBy(xpath = "//button[starts-with(@type, 'submit')]")
//		WebElement search;
		@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button")
		WebElement search;
        @FindBy(xpath = "//*[@id=\"flight-module-2019-10-31t00:55:00-04:00-coach-jfk-cdg-af-9_2019-10-31t20:45:00+01:00-coach-cdg-lis-af-1124-coach-lis-jfk-af-3564_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
		WebElement select;
		@FindBy(xpath = "//*[@id=\"flight-module-2019-10-31t00:55:00-04:00-coach-jfk-cdg-af-9_2019-10-31t20:45:00+01:00-coach-cdg-lis-af-1124-coach-lis-jfk-af-3564_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
		WebElement selectAgain;
		@FindBy (id="bookButton")
		WebElement contBooking;
		@FindBy(id = "firstname[0]")
		WebElement firstName;
		
		@FindBy(id = "lastname[0]")
		WebElement lastName;
		
		@FindBy(id = "phone-number[0]")
		WebElement PhoneNo;
		
		@FindBy(id = "gender_female[0]")
		WebElement gender;
		
		@FindBy(id = "date_of_birth_month0")
		WebElement Month;
		
		
		@FindBy(id = "date_of_birth_day[0]")
		WebElement day;
		
		@FindBy(id = "date_of_birth_year[0]")
		WebElement Year;
		
		@FindBy(id = "no_insurance")
		WebElement insurance;
		
		@FindBy(name = "creditCards[0].cardholder_name")
		WebElement CCname;
		
		@FindBy(id="creditCardInput")
		WebElement CCnum;
		
		@FindBy(name = "creditCards[0].expiration_month")
		WebElement expdate;
		
		@FindBy(name = "creditCards[0].expiration_year")
		WebElement expyear;
		
		@FindBy(id = "new_cc_security_code")
		WebElement cccode;
		
		@FindBy(name = "creditCards[0].street")
		WebElement BillAddress;
		
		@FindBy(name = "creditCards[0].city")
		WebElement city;
		
		@FindBy(name="creditCards[0].state")
		WebElement state;
		
		@FindBy(name="creditCards[0].zipcode")
		WebElement Zipcode;
		
		@FindBy(name = "email")
		WebElement Email;
		
		@FindBy(name="password")
		WebElement PW;
		
		@FindBy(name="repeat_password")
		WebElement confirmPW;
		
		@FindBy(id="complete-booking")
		WebElement compBooking;
		
		public SimpleClassExp_1(WebDriver driver) { // overloaded driver constructor: local driver - we dont have create our driver again and again. It will pick from our global variable
			this.driver = driver; // this key is referring to our global variable
		PageFactory.initElements(driver, this);
		}	
		public void allFlights() {
			flights.click();
			}
		public void flyfrom() {
			flyingfrom.sendKeys("New York, NY (JFK-John F. Kennedy Intl.");
			
		}
		public void flyingTo() {
			flyingto.sendKeys("Paris, France (PAR-All Airports)");
		}
		public void departing() {
			depart.sendKeys("10/31/2019");
		}
		
		public void returning() {
			Return.sendKeys("10/31/2019");
		}
		
		public void searchButton() {
			search.click();
		}
		
		public void selecting() {
			select.click();
		}
		public void selectingAgain() {
			selectAgain.click();
		}
		public void ContinueBooking() {
			contBooking.click();
		}
		public void enterfirst(String name) {
			firstName.sendKeys(name);
		}
		public void enterlast(String name) {
			lastName.sendKeys(name);
		}
		public void phoneNumber(String phone) {
			PhoneNo.sendKeys(phone);
		}
		public void Gender() {
		gender.click();
		}
		public void DateMonth() {
			Month.sendKeys("08 - Aug");	
		}	
		public void Day() {
			day.sendKeys("01");		
		}	
		public void year() {
			Year.sendKeys("1974");
		}
		
		public void Insurance() {
			insurance.click();
		}
		public void ccname() {
			CCname.sendKeys("aisha");	
		}	
		public void CCNo() {
			CCnum.sendKeys("123456778");
		}
		
		public void ExpDate() {
			expdate.sendKeys("02-Feb");
		}	
		public void expYear() {
			expyear.sendKeys("2023");
		}
		public void ccvCode() {
			cccode.sendKeys("123");
		}
		
		public void BillingAddress() {
			BillAddress.sendKeys("21 13 25th road");
		}
		public void City(String ciTy) {
			city.sendKeys(ciTy);
		}
		public void state(String State) {
			state.sendKeys(State);
		}
		public void zipcode(String zipcode) {
			Zipcode.sendKeys(zipcode);
		}
		public void email(String email) {
			Email.sendKeys(email);
		}
		public void password() {
			PW.sendKeys("786786");
		}
		public void ConfirmPW() {
			confirmPW.sendKeys("786786");
		}
		public void completeBooking() {
			compBooking.click();
		}
		
		
}
	
	
	
