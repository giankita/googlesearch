package maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Exampletable {
	WebDriver driver;
  @Test
  public void f() {
	//String v = driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
	 // System.out.println(v);
	 //String st = driver.findElement(By.xpath("//*[contains(text(),'Cierra')]//following-sibling::div[6]/div/span[2]")).getText();
	 String s = driver.findElement(By.xpath("//*[@class = 'ReactTable -striped -highlight']")).getText();
	  System.out.println(s);
	  //driver.findElement(By.xpath(v))
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //driver.get("https://opensource-demo.orangehrmlive.com/");
	    //driver.get("C:\\Users\\ankit\\Desktop\\table.html");
	    //driver.get("C:\\Users\\ankit\\Desktop\\janki2.html");
	    driver.get("https://demoqa.com/webtables");
	    	 //driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
  }
}
