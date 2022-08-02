package maven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Elearning2 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@name='login']")).sendKeys("ankitav");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
		Thread.sleep(3000);
		//Automated email
		driver.findElement(By.linkText("Compose")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("ghjfnkoas@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@name='title']")).sendKeys("This is a Demo");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Hi,");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("This mail is auto generated.");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Regards");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Ankita");
		driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("Automated Message");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='compose']")).click();
		driver.findElement(By.linkText("Logout")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
