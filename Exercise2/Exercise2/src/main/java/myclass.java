import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass {
	
	
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reverside\\Downloads\\chromedriver");
		
		
		
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
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
	}



}


