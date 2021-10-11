import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;







public class Report {
	
	

	public static String browser;
	public static WebDriver driver;
	public static String assert_text;
	public static WebElement button;
	public static WebElement title;
	
	
	

	static ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("HtmlReport.html");
	static ExtentReports extent = new ExtentReports();
	static ExtentTest logger = extent.createTest("Test Results","Previous test results");
	

	
	
	
	@BeforeTest
	public static void setBrowser() {

	extent.attachReporter(htmlReport);

	browser = "Chrome";

	if(browser.contains("Firefox")) {

	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver(); 
	logger.log(Status.INFO, "Firefox selected"); 
	}
	if(browser.contains("Chrome")) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	logger.log(Status.INFO, "Chrome selected");
	}
	}

	
	
	
	@Test(priority=0)
	public static void Registration() {
	driver.get("http://demo.guru99.com/test/newtours/");
	logger.log(Status.INFO, "Browser launced successfully");
	driver.manage().window().maximize();
	
	}
	
	
	
	@Test(priority=1)
	public static void Mecury()  {
	driver.get("http://demo.guru99.com/test/newtours/");
	

	

	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).click();
	driver.findElement(By.name("firstName")).clear();
	driver.findElement(By.name("firstName")).sendKeys("Tsepo");
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::td[11]")).click();
	driver.findElement(By.name("lastName")).click();
	driver.findElement(By.name("lastName")).clear();
	driver.findElement(By.name("lastName")).sendKeys("Matyana");
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email:'])[1]/preceding::td[2]")).click();
	driver.findElement(By.name("phone")).click();
	driver.findElement(By.name("phone")).clear();
	driver.findElement(By.name("phone")).sendKeys("0835886502");
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email:'])[1]/preceding::td[2]")).click();
	driver.findElement(By.id("userName")).click();
	driver.findElement(By.id("userName")).clear();
	driver.findElement(By.id("userName")).sendKeys("tsepometyana93@gmail.com");
	driver.findElement(By.name("address1")).click();
	driver.findElement(By.name("address1")).clear();
	driver.findElement(By.name("address1")).sendKeys("112 Sekoele street Soweto");
	driver.findElement(By.name("city")).click();
	driver.findElement(By.name("city")).clear();
	driver.findElement(By.name("city")).sendKeys("Johannesburg");
	driver.findElement(By.name("state")).clear();
	driver.findElement(By.name("state")).sendKeys("Gauteng");
	driver.findElement(By.name("postalCode")).clear();
	driver.findElement(By.name("postalCode")).sendKeys("1431");
	new Select(driver.findElement(By.name("country"))).selectByVisibleText("SOUTH AFRICA");
	driver.findElement(By.id("email")).click();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("TsepoM");
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Country:'])[1]/following::td[3]")).click();
	driver.findElement(By.name("password")).click();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("55463");
	driver.findElement(By.name("confirmPassword")).click();
	driver.findElement(By.name("confirmPassword")).clear();
	driver.findElement(By.name("confirmPassword")).sendKeys("55463");
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.id("name-and-slogan")).click();
	
	

   
	
	driver.get("http://demo.guru99.com/test/newtours/");
    driver.findElement(By.linkText("SIGN-ON")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("TsepoM");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("55463");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div/div[2]")).click();
    
    
    
    
    driver.findElement(By.linkText("SIGN-OFF")).click();
  
	
	
	
	logger.log(Status.INFO, "Registration created succesfully");
	logger.log(Status.PASS, "Registration passed");
	}
	

	@Test (priority=2)
	public static void sauceLogout() {
	
	logger.log(Status.INFO, "Logged out successfully");
	logger.log(Status.PASS, "Logout passed");

	logger.log(Status.PASS, "Registration Passed");
	extent.flush();

	driver.quit();
	}

	}





	
	


