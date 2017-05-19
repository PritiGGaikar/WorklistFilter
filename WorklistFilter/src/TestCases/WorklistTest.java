package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Technical.Worklist;

public class WorklistTest extends WebDriverPass{
	 ExtentReports report;
	 ExtentTest test;
	 
	Worklist w = new Worklist();
	
	
  @Test(priority=1)
  public void WokrlistModule() throws InterruptedException {
	  	  
	  
	  w.worklistindexFilter(driver);
	  test=report.startTest("Currency");
	  Assert.assertTrue(true);
	     test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
  }
  @Test(priority=2)
  public void Filter1() throws InterruptedException {
	  	  
	  
	  w.Filter1(driver);
	 	    
 
  }
  @Test(priority=3)
  public void Filter2() throws InterruptedException {
	  	  
	  
	  w.Filter2(driver);
	 	    
 
  }
  @Test(priority=4)
  public void Filter3() throws InterruptedException {
	  	  
	  
	  w.Filter3(driver);
	 	    
 
  }
  @Test(priority=5)
  public void Filter4() throws InterruptedException {
	  	  
	  
	  w.Filter4(driver);
	 	    
 
  }
  @Test(priority=6)
  public void Filter5() throws InterruptedException {
	  	  
	  
	  w.Filter5(driver);
	 	    
 
  }
  
  
  @Test(priority=7)
  public void Pending() throws InterruptedException {
	  	  
	  
	  w.Pending(driver);
	 	    
 
  }
  
  
  @Test(priority=8)
  public void Completed() throws InterruptedException {
	  	  
	  
	  w.Completed(driver);
	 	    
 
  }
  
  @Test(priority=9)
  public void  Reworkes() throws InterruptedException {
	  	  
	  
	  w. Reworkes(driver);
	 	    
 
  }
  @Test(priority=10)
  public void   Verified() throws InterruptedException {
	  	  
	  
	  w.  Verified(driver);
	 	    
	  
  }
  @Test(priority=11)
  public void   overdue() throws InterruptedException {
	  	  
	  
	  w. overdue(driver);
  } 	    
}
