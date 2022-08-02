package maven;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
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

public class Elementex {
	WebDriver driver;
	
	  @Test(enabled = false)
	  public void f() throws InterruptedException {
		  String Title=driver.getTitle();
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  //if i want to fetch data(Value,what is stored)from the application
		  String Username = driver.findElement(By.name("txtUsername")).getAttribute("value");
		  System.out.println(Username);
		  Assert.assertEquals(Username,"Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  String Password = driver.findElement(By.id("txtPassword")).getAttribute("value");
		  System.out.println(Password); 
		  Assert.assertEquals(Password,"admin123");
		     driver.findElement(By.id("btnLogin")).click();
		     String Login = driver.findElement(By.id("btnLogin")).getAttribute("value");
		     System.out.println(Login);
		     Assert.assertEquals(Login,"LOGIN");
		     Thread.sleep(3000);
		     String Title1=driver.getTitle();
		     if(Title.equalsIgnoreCase(Title1)) {
		    	 driver.findElement(By.id("welcome")).click();
			     Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			     System.out.println("I m ankita");
		    	 
		     }
		     else {
		    	 System.out.println("It is not same");
		     }
		    
		     
	  }
	  @BeforeTest
	  public void beforeTest() {

			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//driver.get("https://opensource-demo.orangehrmlive.com/");
		    //driver.navigate().to("http://www.google.com");
		    //driver.navigate().to("https://demoqa.com/upload-download");
		   // driver.navigate().to("https://demoqa.com/alerts");
		    //driver.get("https://demo.guru99.com/test/newtours/");
		  
			driver.manage().window().maximize();
			}
	  @Test (enabled= false)
	  public void testcase1()
	  {
		WebElement UN = driver.findElement(By.xpath("//*[@name='username']"));
 if(UN.isEnabled())
{
	UN.clear();
	UN.sendKeys("admin");
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
	  driver.findElement(By.xpath("//*@[name='submit']")).click();
	  }
@Test(enabled= false)
public void testcase2() throws InterruptedException 
     {
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	String hd = driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
	Assert.assertEquals("Login Successfully",hd);
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	Thread.sleep(3000);
	WebElement dd = driver.findElement(By.name("passCount"));
	Select sell = new Select (dd);
	sell.selectByVisibleText("1");
	Thread.sleep(3000);
	sell.selectByIndex(3);
	Thread.sleep(3000);
	sell.selectByValue("2");
	WebElement df1 = driver.findElement(By.name("fromPort"));
	Select sell1 = new Select (df1);
	//sell1.selectByVisibleText("London");
	List<WebElement> values = sell1.getOptions();
	System.out.println(values.size());
	for(int i = 0;i<values.size();i++)
	{
		System.out.println(values.get(i).getText());
	}
	sell1.selectByIndex(5);
	WebElement First = sell1.getFirstSelectedOption();
	System.out.println(First.getAttribute("value"));
	Thread.sleep(3000);
	/*Select year = new Select(driver.findElement(By.name("fromMonth")));
	year.selectByVisibleText("Aug");
	Thread.sleep(3000);
	Select year1 = new Select(driver.findElement(By.name("fromDay")));
	year1.selectByVisibleText("27");*/
	/*WebElement dd1 = driver.findElement(By.name("fromMonth"));
	Select sell2 = new Select (dd1);
	sell2.selectByVisibleText("March");*/
     driver.findElement(By.name("fromMonth")).sendKeys("March");
	driver.findElement(By.name("fromDay")).sendKeys("15");
	Thread.sleep(3000);
	driver.findElement(By.name("toPort")).sendKeys("Paris");
	Thread.sleep(3000);
	driver.findElement(By.name("toMonth")).sendKeys("April");
	driver.findElement(By.name("toDay")).sendKeys("2");
	Thread.sleep(3000);
	//driver.findElement(By.name("servClass")).click();
	driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
     Thread.sleep(3000);
   driver.findElement(By.name("airline")).sendKeys("Pangea Airlines");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@name='findFlights']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	//driver.findElement(By.linkText ("Home"));  
	Thread.sleep(3000);
}
         @Test (enabled=false)
         public void testcase4() throws InterruptedException
         {
        	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        		driver.findElement(By.id("btnLogin")).click();
        		Thread.sleep(3000);
        		//tagname called a this means a link
        		//findelements this will find one element
        		//findselements this will automatically find all the element
        		//when u hv two or more elements with same attribute we usefindelements
        		List<WebElement>link = driver.findElements(By.tagName("a"));
        		//total no of links
        		System.out.println("Total Number of links are " +link.size());
        		
        		//for(int i=0;i<link.size();i++)
        		//{
        			//System.out.println(i +" : "+ link.get(i).getText());
        			//}
        		//for Enhanaced loop
        		for(WebElement e:link)
        		{
        			String eachlink = e.getText();
        			System.out.println(eachlink);
        		}
        		//driver.findElement(By.partialLinkText("welcome")).click();
        		//Thread.sleep(3000);
        		//driver.findElement(By.linkText("Logout")).click();
        		//driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
        		driver.findElement(By.linkText("PIM")).click();
        		//driver.navigate().back();
        		//Thread.sleep(3000);
        		//driver.navigate().forward();
        		//Thread.sleep(3000);
        		//driver.findElement(By.linkText("Leave")).click();
        		//driver.navigate().refresh();
        		//i want to navigate to a different URL
        		//driver.navigate().to("http://www.google.com");
        		//Actions is a class which contain sub methods like mouse over//move element
        		//Any actions i want to do any element
        		Actions act = new Actions(driver);
        		WebElement cllink = driver.findElement(By.linkText("Configuration"));
        		act.moveToElement(cllink).build().perform();
        		act.sendKeys(Keys.ARROW_DOWN).build().perform();
        		act.sendKeys(Keys.ARROW_DOWN).build().perform();
        		act.sendKeys(Keys.ENTER).build().perform();
        		//driver.findElement(By.linkText("Data Import")).click();
         }
	@Test(enabled = false)
	public void testcase5() throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		
	}
   @Test(enabled = false)
   public void testcase6() throws InterruptedException, AWTException
   {
	   //navigate to google
	  WebElement link = driver.findElement(By.linkText("Gmail"));
	  Thread.sleep(4000);
	  Actions act = new Actions (driver);
	  //context click is a selenium method to right click on any element
	  act.contextClick(link).build().perform();
	  //when i right click n i get features from browser if i want to automate i use robot class
	  Robot rbt = new Robot();
	  rbt.keyPress(KeyEvent.VK_DOWN);
	  rbt.keyPress(KeyEvent.VK_DOWN);
	  Thread.sleep(4000);
	  rbt.keyPress(KeyEvent.VK_UP);
	  rbt.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  String Title = driver.getCurrentUrl();
	  System.out.println(Title);
	  //ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   // driver.switchTo().window(tabs2.get(1));
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  //String Title = driver.getTitle();
	  //System.out.println(Title);
	 act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	  //String Title1 = driver.getTitle();
	  //System.out.println(Title1);
	  rbt.keyPress(KeyEvent.VK_CONTROL);
	  rbt.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(3000);
	  //String Title1 = driver.getCurrentUrl();
	  //System.out.println(Title1);
	 // driver.get("https://opensource-demo.orangehrmlive.com/");
	  //act.sendKeys(Keys.CONTROL + "\t").build().perform();
   }
	@Test(enabled = false)
	public void testcase7()
	{
	driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\ankit\\Desktop\\dummy.docx");
	
	}
  @Test(enabled = false)
  public void testcase8() throws InterruptedException
  {
	  //none of client like thread.sleep
	  //two types of wait
	//webpage i see lot of pop ups are called as alerts
	  driver.findElement(By.id("alertButton")).click();
	  //i am on a webpage and some pop up comes then i want to switch myself to the pop the i use switch to
	  Alert alt = driver.switchTo().alert();
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();
	  

	  driver.findElement(By.id("timerAlertButton")).click();
	  //Thread.sleep(5000);
	  WebDriverWait wt = new WebDriverWait(driver, 180);
	  wt.until(ExpectedConditions.alertIsPresent());
	  alt.accept();
	  Thread.sleep(3000);
	  
	  //confirm alert which means it as ok button as well as cancel button
	  //so if i want to click on ok accept if i want tot click on cancel i use dismiss
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  alt.dismiss();
	  // prompt is basically to accept some data
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("Ankita");
	  Thread.sleep(3000);
	  System.out.println(alt.getText());
	  alt.accept();
	  
	 
  }
	
  @AfterTest
	  public void closedriver() {
		  //driver.close();
	  }


}
