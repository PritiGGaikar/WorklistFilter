package Technical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonFunction.RW;

public class Filter extends RW {
	public void worklistindexFilter(WebDriver driver1) throws InterruptedException { // @Test(priority=1)

		WebDriver driver = driver1;
		

		WebElement technical = driver.findElement(By.xpath(".//*[@id='nav']/li[8]/a/span")); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		
 		
		

		WebElement worklist = driver.findElement(By.xpath(".//*[@id='nav']/li[8]/ul/li[4]/a/span"));// path for Worklist
																					
		worklist.click();
		action.moveToElement(worklist).build().perform();
		
 		
		
		WebElement worklistindex = driver.findElement(By.linkText("Worklist Index")); // path for worklist index
		worklistindex.click();
	
		Thread.sleep(5000);
		
	}
	
	public void Newjobcreated(WebDriver driver1) throws InterruptedException {       // @Test(priority=2)
		WebDriver driver = driver1;
		
		
	    driver.findElement(By.xpath(".//*[@id='dvDefaultFilter']/table[1]/tbody/tr/td[1]/div/table/tbody/tr/td[2]")).click();    //Click on New job created in last 24HRS click
/*
	    String JobsCount = driver.findElement(By.id("ctl00_MainContent_divl24")).getText(); // New job created in last 24HRS 
		Thread.sleep(3000);																			
		System.out.println("New job created in last 24HRS " + JobsCount);
		Thread.sleep(3000);
		

		String Pagejobs = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText(); // Total available New job created in last 24HRS  are 
		Thread.sleep(3000);																
		System.out.println("Total available New job created in last 24HRS  are " + Pagejobs);
		Thread.sleep(3000);
		*/
	   // String expected = driver.findElement(By.id("ctl00_MainContent_divl24")).getText();
	   // String actual = driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();
	 //   if(expected == actual) 
	    	 // if(expected.equals(actual))
	    	//if("expected String".equals("actual string"))
	       {
	    		  
	    	   String JobsCount = driver.findElement(By.id("ctl00_MainContent_divl24")).getText();
	    		Thread.sleep(3000);
	    		System.out.println("New job created in last 24HRS " + JobsCount);
	    		
	    		
	    	    String Pagejobs =driver.findElement(By.id("ctl00_MainContent_lblRecordCount")).getText();
	    	    System.out.println("Total available New job created in last 24HRS  are " + Pagejobs);
	    		Thread.sleep(3000);
	    		/*
	    	    if(expected == actual) 
	    	       {
	    	    	 System.out.println("Jobs matches ");
	    	    	 Thread.sleep(3000);
	    	       } 
	    	    else
	    	       {
	    	    	 System.out.println("Jobs does not matches ");
	    	    	 Thread.sleep(3000);
	    	       }	  
	    		  */
	    		  
	    		
	    	    if(JobsCount.equals(Pagejobs)){
	    	    	System.out.println("Joes matches ");
	    	    }
	    	        else {
	    	            System.out.println("Joe does  matches ");
	    	        }
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	       }}    		  
	    		  
	    
	}
	


	       
	   	