package maven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterTest;

public class Wintest {
	WebDriver driver;
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  //2 methods used getwindowhandle and getwindowhandels
	  //fetch parent window
	  String parentwindow = driver.getWindowHandle();
	  System.out.println(parentwindow);
	  //i want to click on this element for three times
	  WebElement windbtn= driver.findElement(By.id("windowButton"));
	  for(int i=0; i<3; i++) {
		  windbtn.click();
  }
	  //i want to know how many windows are there
	  Set<String>allwindow = driver.getWindowHandles();
	  //getting print id of all child window
	  System.out.println(allwindow);
	//getting print all child window count
	  System.out.println(allwindow.size());
	//i m creating a variable called lastwindow
	  String lastwindow = "";
	//i want to open google.com in all window
	  for(String handel : allwindow)
	  {
		  System.out.println("I want to open google.com in all window");
		  driver.switchTo().window(handel);
		  driver.get("https://www.google.com");
		  //i m creating a variable called lastwindow
		  lastwindow = handel;
		  
		 
	  }
	  Thread.sleep(3000);
	  //after everthing done it will go to parent window and open orange HRM
	  driver.switchTo().window(parentwindow);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.close();//only active window close
	  //driver.quit();//it will close multiple wi;ndows
	  driver.switchTo().window(lastwindow);
	  driver.get("https://mail.google.com/");
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   //driver.get("https://opensource-demo.orangehrmlive.com/");
	   //parent window
	   //driver.get("https://demoqa.com/browser-windows");
	   Thread.sleep(3000);
		driver.manage().window().maximize();
	 }
 @Test(enabled= false)
 public void testc1() throws InterruptedException
 {
	 //i want to open one more tab.It  not supporting
	// String tab = Keys.chord(Keys.CONTROL + "t");
	 //driver.findElement(By.cssSelector("body")).sendKeys(tab);
	// Actions act = new Actions(driver);
	 //act.sendKeys(Keys.chord(Keys.CONTROL + "N")).build().perform();
	// Thread.sleep(3000);
	 //doing this with the help of javascript
	 //two interface selenium supports 1.Webdriver n 2.javascript
//	JavascriptExecutor js = (JavascriptExecutor)driver; 
//	String title = js.executeScript("return document.title").toString();
//	System.out.println(title);
//	String url = js.executeScript("return document.URL").toString();
//	System.out.println(url);
//	String domain = js.executeScript("return document.domain").toString();
//	System.out.println(domain);
//	 // same application orangeHRM. I want to fetch the inner text of all elements
//	String alltext = js.executeScript("return document.documentElement.innerText").toString();
//	System.out.println(alltext);
//	 String parenttab=driver.getWindowHandle();
//	 	System.out.println(parenttab);
//	 	WebDriver newtab =driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
//	 	newtab.get("https://demoqa.com/");
//	 	Thread.sleep(3000);
//	    Set<String> alltab =driver.getWindowHandles();
//	    Object[]altab= alltab.toArray();
//	    System.out.println(alltab.size());
//	   // driver.switchTo().window(parenttab);
//	    //driver.get("http://google.com");
//	    driver.switchTo().window((String) altab[0]);
//	   driver.close();
//	   driver.switchTo().window((String) altab[1]);
//	   driver.get("https://www.google.com");
//	   Thread.sleep(3000);
//   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya",Keys.ENTER);
	//  Actions alt= new Actions(driver);
//		 // alt.sendKeys(Keys.PAGE_DOWN).build().perform();
////		  js.executeScript("window.scrollBy(0,600)");
//		  //if you want to scroll to the end of the page, then you can use document.body.scrollHeight
//		 
//		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		  Thread.sleep(3000);
//		  //I want to scroll up, if I want to scroll all the way up then I use -
//		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		  //Thread.sleep(3000);
		
          //js.executeScript("document.getElementsByClassName('LC20lb MBeuO DKV0Md')[4].scrollIntoView()");
          //Thread.sleep(3000);
          //driver.findElement(By.partialLinkText("Moolya Software Testing Reviews by 48 Employees")).click();
//		  //ScrollIntoView()its a method
//		  //help me to scroll a specific element
//	   //driver.quit();
//	   driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	     driver.findElement(By.id("btnLogin")).click();
//	     Thread.sleep(3000);
//	     driver.findElement(By.linkText("PIM")).click();
//	    
//	     driver.findElement(By.linkText(" Employee List")).click();
//	     //this method will help me to scroll a specific element
//	     js.executeScript("document.getElementById('ohrmList_chkSelectRecord_29').scrollIntoView()");
//	     Thread.sleep(3000);
}


@Test
  public void case2() throws InterruptedException, AWTException {
	  //driver.get("https://www.google.com");
	   Thread.sleep(3000);  
	   //to create javascript variable
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
	   driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.partialLinkText("Teams")).click();
		 Thread.sleep(5000);
		// Robot rbt = new Robot();
		  //rbt.keyPress(KeyEvent.VK_DOWN);
		  driver.findElement(By.linkText("India")).click();
		 Thread.sleep(5000);
	     js.executeScript("document.getElementsByClassName('ds-flex ds-flex-col ds-w-2/3')[0].scrollIntoView()");
	      Thread.sleep(4000);
		 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();








  }
  
@AfterTest
  public void afterTest() {
  
 // driver.close();
}
}
