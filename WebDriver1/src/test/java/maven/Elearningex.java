package maven;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Elearningex {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {

			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		
			}
	 @Test (enabled= false)
	  public void testcase1()
	  {
		WebElement UN = driver.findElement(By.xpath("//*[@name='login']"));
if(UN.isEnabled())
{
	UN.clear();
	UN.sendKeys("ankitav");
}
	if (UN.isDisplayed())
{
		System.out.println(UN.getAttribute("value"));
	}
	else {
	System.out.println("Username textbox is Disabled");	
	}
	WebElement UN1 =driver.findElement(By.xpath("//*[@name='password']"));
	UN.clear();
	UN.sendKeys("admin123");
	  
	  if (UN1.isDisplayed())
	  {
		  System.out.println(UN1.getAttribute("value"));
	  }
	  else {
		  System.out.println("Password textbox is disabled");
	  }
	  driver.findElement(By.xpath("//*@[name='submitAuth']")).click();
	  }
		@Test
		public void testcase2() throws InterruptedException {
			driver.findElement(By.xpath("//*[@name='login']")).sendKeys("ankitav");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
			//driver.findElement(By.linkText("Inbox")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Compose")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
			driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("ghjfnkoas@gmail.com",Keys.ENTER);
			//driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
			//driver.findElement(By.xpath("//*[@name='title']")).click();
			driver.findElement(By.xpath("//*[@name='title']")).sendKeys("This is a Demo");
			//driver.findElement(By.xpath("//*[@class='cke_1_contents']")).click();
			//driver.findElement(By.xpath("//*[@name='attach_1']")).click();
			//driver.findElement(By.xpath("//*[@name='_qf__compose_message']")).sendKeys("This is a Demo");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
			driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Hello,");
			//driver.findElement(By.linkText("Logout")).click();
	}
	
		 @AfterTest
		  public void closedriver() {
			 // driver.close();
		 }
}