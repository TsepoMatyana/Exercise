import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class verifyTittle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reverside\\Downloads\\chromedriver");
		

	}

	@Test
	public void verifyTittle()
	{
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours");

	    String my_tittle=driver.getTitle();
		System.out.println("Title is"+my_tittle);

		Assert.assertTrue(my_tittle.contains("Selenium webdriver mecury tours"));
		System.out.println("Test completed Page verified");
   
   
		
	
		






		{

		}



	}}
