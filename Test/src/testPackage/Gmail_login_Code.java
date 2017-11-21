
package testPackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.List;
//import org.openqa.selenium.firefox.*;
import java.util.concurrent.*;

public class Gmail_login_Code {
	
public static void main(String[] args) {

	 String user_next = "//*[@id="+"\"identifierNext\"" + "]/content/span";
	 
	 String pass_next = "//*[@id="+"\"passwordNext\"" + "]/content/span";
	 
	 String myaccount = "//*[@id="+"\"gb\""+"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span";
	 
	 String signout = "//*[@id="+"\"gb_71\""+"]";
	 

	//initialize Chrome driver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\satish.h\\Desktop\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();

//Open gmail
driver.get("http://www.gmail.com");

// Enter userd id
WebElement user = driver.findElement(By.id("identifierId"));
user.sendKeys("satishhuzuru@gmail.com");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//WebElement textElement = driver.findElement(By.xpath("//*[@id="+"\"logo\""+"]/div[2]/span[3]"));
//String Text= driver.findElement(By.cssSelector("#spnLogCount")).getText();
//System.out.println("total" + Text);

//wait 5 secs for userid to be entered


driver.findElement(By.xpath(user_next)).click();

//Enter Password
WebElement pass = driver.findElement(By.name("password"));
pass.sendKeys("mylife@#99");

driver.findElement(By.xpath(pass_next)).click();

//clicking on myaccount 
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.findElement(By.xpath(myaccount)).click();

//Clicking on singnout
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.xpath(signout)).click();

}

}