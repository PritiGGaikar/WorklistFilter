package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import Technical.Filter;




public class FilterTest  extends WebDriverPass{
	
	 
	Filter w = new Filter();
	
	
 @Test(priority=1)
 public void WokrlistModule() throws InterruptedException {
	  	  
	  
	  w.worklistindexFilter(driver);
	 
	  Assert.assertTrue(true);
	   

 }
 @Test(priority=2)
 public void Newjobcreated() throws InterruptedException {
	  	  
	  
	  w.Newjobcreated(driver);
	   String JobsCount=driver.findElement(By.id("ctl00_MainContent_divl24")).getText(); //New job created in last 24HRS  

	    String Pagejobs=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_lblRecordCount']")).getText();

	  Assert.assertEquals(JobsCount, Pagejobs);    

 }
 /*@Test(priority=3)
 public void Folloupresponse() throws InterruptedException {
	  	  
	  
	  w.Folloupresponse(driver);
	 	    

 }*/
}
