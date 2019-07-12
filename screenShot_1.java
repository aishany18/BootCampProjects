package screenShot_7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot_1 {
	public static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/Muhammad/Desktop/Automation/jars/chromedriver");
driver = new ChromeDriver();

String url = "https://m.saks.com/";
driver.get(url);

String name = "picture.png";
String directories = "//Users/Muhammad/Desktop//";

File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sourceFile, new File(directories + name));

	}
}
