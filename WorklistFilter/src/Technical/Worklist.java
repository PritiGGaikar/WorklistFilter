
package Technical;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonFunction.RW;

public class Worklist extends RW {

private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports("C:\\Users\\Priti\\workspace\\WorklistFilter\\WorklistIndex Report.html", false);
            
            report
                .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
	public void worklistindexFilter(WebDriver driver1) throws InterruptedException { // @Test(priority=1)

		WebDriver driver = driver1;
		
		
		// new instance
		 // report=new ExtentReports("C:\\Users\\Priti\\workspace\\WorklistFilter\\Report Generation\\Worklist.html",true);		 
		 
		//     test=report.startTest("worklistindexFilter");
		
		
		WebElement technical = driver.findElement(By.xpath((data.getData(4, 1, 2)))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		//test.log(LogStatus.INFO, "Technical");
 		
		Thread.sleep(2000);

		WebElement worklist = driver.findElement(By.xpath((data.getData(4, 2, 2))));// path for Worklist
																					
		worklist.click();
		action.moveToElement(worklist).build().perform();
		//test.log(LogStatus.INFO, "Worklist");
 		
		
		WebElement worklistindex = driver.findElement(By.cssSelector((data.getData(4, 3, 2)))); // path for worklist index
		worklistindex.click();
		//test.log(LogStatus.INFO, "worklist index");
		Thread.sleep(5000);
		// report.endTest(test);
		 // report.flush();
	}

       // job filter
	
              	// -----------method for counting New job created in last 24HRS---------//
	
		public void Filter1(WebDriver driver1) throws InterruptedException {       // @Test(priority=2)
			WebDriver driver = driver1;
		//	test=report.startTest("Filter1");
		//	
			
	    driver.findElement(By.id(data.getData(4, 4, 2))).click();    //New job created in last 24HRS click
	   // test.log(LogStatus.INFO, "New job created");
 		
		 Thread.sleep(3000); 
		 String  JobsCount =driver.findElement(By.id(data.getData(4, 5, 2))).getText();    //New job created in last 24HRS
		// test.log(LogStatus.INFO, "/New job created in last 24HRS");
  		
		 System.out.println("New job created in last 24HRS " +  JobsCount); 
		 String Pagejobs = driver.findElement(By.id(data.getData(4, 6, 2))).getText();     //Total New job created in last 24HRS
		// test.log(LogStatus.INFO, "Total New job created in last 24HRS");
  		
		System.out.println("Total available New job created in last 24HRS  are " +Pagejobs);
		// report.endTest(test);
		//  report.flush();
		 
		}
		
		// -----------method for Folloup/response recevied fromvessels in last 24 Hrs---------//
		public void Filter2(WebDriver driver1) throws InterruptedException {    // @Test(priority=3)
			WebDriver driver = driver1;
		//	test=report.startTest("Filter2");
			
	    driver.findElement(By.id(data.getData(4, 7, 2))).click();    //Folloup/response recevied fromvessels in last 24 Hrs 
	   // test.log(LogStatus.INFO, "Folloup/response recevied ");
		 Thread.sleep(3000); 
		 String  Followup=driver.findElement(By.id(data.getData(4, 8, 2))).getText();  //Folloup/response recevied fromvessels in last 24 Hrs 
		// test.log(LogStatus.INFO, "Folloup/response recevied fromvessels in last 24 Hrs ");
		 
		 System.out.println("Folloup/response recevied fromvessels in last 24 Hrs  are " + Followup); 
		 String Followup1 = driver.findElement(By.id(data.getData(4, 9, 2))).getText();  //Total Folloup/response recevied fromvessels in last 24 Hrs 
		// test.log(LogStatus.INFO, "Total Folloup/response recevied fromvessels in last 24 Hrs ");
		System.out.println("Total available Folloup/response recevied fromvessels in last 24 Hrs  are " +Followup1);
		// report.endTest(test);
		//  report.flush();
		 
		}
		
		
		// -----------method for NCR response in last 7 days---------//
		public void Filter3(WebDriver driver1) throws InterruptedException {     // @Test(priority=4)
			WebDriver driver = driver1;
		//	test=report.startTest("Filter3");
		 driver.findElement(By.id(data.getData(4, 10, 2))).click();    //NCR response in last 7 days 
		// test.log(LogStatus.INFO, "NCR response in last 7 days");
		 Thread.sleep(3000);
		 
		 String  NCR=driver.findElement(By.id(data.getData(4, 11, 2))).getText(); //NCR response in last 7 days 
		// test.log(LogStatus.INFO, "NCR response in last 7 days");
		 System.out.println("NCR response in last 7 days are " + NCR); 
		 String NCR1 = driver.findElement(By.id(data.getData(4, 12, 2))).getText();  // Total NCR response in last 7 days  
		// test.log(LogStatus.INFO, "Total NCR response in last 7 days ");
		System.out.println("Total available NCR response in last 7 days " +NCR1 );
		// report.endTest(test);
		//  report.flush();
		} 
		
		
		// -----------method for Jobs compleded  in last 7days--------//
		
		public void Filter4(WebDriver driver1) throws InterruptedException {           // @Test(priority=5)
			WebDriver driver = driver1;
		//	test=report.startTest("Filter4");
			
		 driver.findElement(By.id(data.getData(4, 13, 2))).click();    //jobs compleded  in last 7days	
		// test.log(LogStatus.INFO, "jobs compleded");   
	    Thread.sleep(3000); 
		 String  Jobcomplet=driver.findElement(By.id(data.getData(4, 14, 2))).getText();   //jobs compleded  in last 7days	
		// test.log(LogStatus.INFO, "jobs compleded  in last 7days");
		 System.out.println("jobs compleded  in last 7days are " + Jobcomplet); 
		 String Jobcomplet1 = driver.findElement(By.id(data.getData(4, 15, 2))).getText();  //Total jobs compleded  in last 7days
		// test.log(LogStatus.INFO, "Total jobs compleded  in last 7day");
		System.out.println("Total available jobs compleded  in last 7days are " +Jobcomplet1 );
		// report.endTest(test);
		//  report.flush();
		 
		}
		
		
		// -----------method for jobs compleded but not verified--------//
		
		public void Filter5(WebDriver driver1) throws InterruptedException {        // @Test(priority=6)
			WebDriver driver = driver1;
		//	test=report.startTest("Filter5");
			
		 driver.findElement(By.id(data.getData(4, 16, 2))).click();    //jobs compleded but not verified
		// test.log(LogStatus.INFO, "jobs compleded but not verified");
		    
		 Thread.sleep(3000);
		 
		 String  jobNotverified=driver.findElement(By.id(data.getData(4, 17, 2))).getText();  //jobs compleded but not verified
		// test.log(LogStatus.INFO, "jobs compleded but not verified");
		 System.out.println("jobs compleded but not verified are " + jobNotverified);
		 
		 String  jobNotverified1 = driver.findElement(By.id(data.getData(4, 18, 2))).getText();  //Total jobs compleded but not verified
		// test.log(LogStatus.INFO, "Total jobs compleded but not verified");
		System.out.println("Total available jobs compleded but not verified are " + jobNotverified1 );
		// report.endTest(test);
		//  report.flush();
		}
		
		// -----------method for counting Pending jobs---------//
		
		public void Pending (WebDriver driver1) throws InterruptedException {                 // @Test(priority=7)
			WebDriver driver = driver1;
	
		//	test=report.startTest("Pending");
        // Fleet-B HARUKA  

           Select Fleet = new Select(driver.findElement(By.id(data.getData(4, 19, 2)))); // path for Fleet dropdown
           Fleet.selectByVisibleText("Fleet-B");
        //   test.log(LogStatus.INFO, "Fleet-B dropdown");
            Thread.sleep(3000);


            Select Vesseles = new Select(driver.findElement(By.id(data.getData(4, 21, 2)))); // path for dropdown Vessels
            Vesseles.selectByVisibleText("HARUKA");
          //  test.log(LogStatus.INFO, "HARUKA dropdown");
            Thread.sleep(3000);

            driver.findElement(By.id(data.getData(4, 23, 2))).click();    //path Search Button
          //  test.log(LogStatus.INFO, "Search");
            Thread.sleep(3000);	
            
            
          //Pending job Status
			 System.out.println(driver.findElement(By.xpath(data.getData(4, 24, 2))).getText());    //Total jobs
			// test.log(LogStatus.INFO, "Total jobs");

			 System.out.println(driver.findElement(By.xpath(data.getData(4, 25, 2))).getText());    //Pending status
			// test.log(LogStatus.INFO, "Pending status");
			// report.endTest(test);
			//  report.flush();
			
		}
		

			
			// -----------method for counting Completed jobs---------//
				
				public void Completed(WebDriver driver1) throws InterruptedException {           // @Test(priority=8)
					WebDriver driver = driver1;
				//	test=report.startTest("Completed");
			 
		
			
			           // All  Completed Job
			
			
			 driver.findElement(By.id(data.getData(4, 26, 2))).click();    // status completed Checkbox chechbox
			// test.log(LogStatus.INFO, "completed Checkbox");
			 Thread.sleep(3000);
			 driver.findElement(By.id(data.getData(4, 27, 2))).click();    // status uncheck pending Checkbox
			// test.log(LogStatus.INFO, "uncheck pending");
			 Thread.sleep(3000);
			 
			 driver.findElement(By.id(data.getData(4, 28, 2))).click();    //path Search Button
			// test.log(LogStatus.INFO, "Search");
			 Thread.sleep(3000);

			
			// Total complected job and Status
			
			 System.out.println(driver.findElement(By.xpath(data.getData(4, 29, 2))).getText());    //Total jobs
			// test.log(LogStatus.INFO, "Total jobs");

			 System.out.println(driver.findElement(By.xpath(data.getData(4, 30, 2))).getText());    //Completed status
			// test.log(LogStatus.INFO, "Completed status");
			// report.endTest(test);
			//  report.flush();
				}
			 
			// -----------method for counting  Re-workes jobs---------//
				
				public void  Reworkes(WebDriver driver1) throws InterruptedException {  // @Test(priority=9)
					WebDriver driver = driver1;
				//	test=report.startTest("Reworkes");
			
                 //All Re-workes job
			

			 driver.findElement(By.id(data.getData(4, 31, 2))).click();    //path for status  Re-worked Checkbox
			// test.log(LogStatus.INFO, "Re-worked Checkbox");
			 Thread.sleep(3000);
			 
			 driver.findElement(By.id(data.getData(4, 32, 2))).click();    //path for status uncheck Completed Checkbox
		//	 test.log(LogStatus.INFO, "uncheck Completed Checkbox");
			 Thread.sleep(3000);
			 driver.findElement(By.id(data.getData(4, 33, 2))).click();    //path Search
		//	 test.log(LogStatus.INFO, "Search");
			 Thread.sleep(3000);
				
			
			
			 //Total Reworked job and Status
			 
			 
			 System.out.println(driver.findElement(By.xpath(data.getData(4, 34, 2))).getText());    //Total jobs
			// test.log(LogStatus.INFO, "Total jobs");

			 System.out.println(driver.findElement(By.xpath(data.getData(4, 35, 2))).getText());    //Reworked status
			// test.log(LogStatus.INFO, "Reworked status");
			/* report.endTest(test);
			  report.flush();*/
			 
}

// -----------method for counting  Verified jobs---------//
	
				public void   Verified(WebDriver driver1) throws InterruptedException {            // @Test(priority=10)
					WebDriver driver = driver1;		
				//	test=report.startTest("Verified");
					
			//all Verified Job
			
			 driver.findElement(By.id(data.getData(4, 36, 2))).click();    //path for status  Verified Checkbox
			// test.log(LogStatus.INFO, "Verified Checkbox");
			 Thread.sleep(3000);
			
			 driver.findElement(By.id(data.getData(4, 37, 2))).click();    //path for status Uncheck for Re-worked Checkbox
			// test.log(LogStatus.INFO, " Uncheck for Re-worked Checkbox");
			 Thread.sleep(3000);
			 
			 driver.findElement(By.id(data.getData(4, 38, 2))).click();    //path Search
			// test.log(LogStatus.INFO, "Search");
			 Thread.sleep(3000);

			
			 //Total  Verified Job and Status
			 System.out.println(driver.findElement(By.xpath(data.getData(4, 39, 2))).getText());    //Total Verified jobs
			// test.log(LogStatus.INFO, "Total Verified jobs");

			 System.out.println(driver.findElement(By.xpath(data.getData(4, 40, 2))).getText());    //Verifiyed  status
			// test.log(LogStatus.INFO, "Verifiyed  status");
			/* report.endTest(test);
			  report.flush();*/
			 
	}
			
	// -----------method for counting overdue jobs---------//
	
				public void   overdue(WebDriver driver1) throws InterruptedException {         // @Test(priority=11)
					WebDriver driver = driver1;		
				//	test=report.startTest("overdue");
		  
			
	            // All overdue Job
   
			 driver.findElement(By.id(data.getData(4, 41, 2))).click();    //path for status overdue Checkbox
		//	 test.log(LogStatus.INFO, "overdue Checkbox");
			 Thread.sleep(3000);
			 driver.findElement(By.id(data.getData(4, 42, 2))).click();    //path for status Uncheck for Verified Checkbox
		//	 test.log(LogStatus.INFO, "Uncheck for Verified Checkbox");
			 Thread.sleep(3000);
			 
			 driver.findElement(By.id(data.getData(4, 43, 2))).click();    //path Search button
		//	 test.log(LogStatus.ERROR, "Search");
			 Thread.sleep(3000);

                    //Total overdue Job and Status	
			 
			 
			 System.out.println(driver.findElement(By.xpath(data.getData(4, 44, 2))).getText());    //Total Overdue jobs
		//	 test.log(LogStatus.WARNING, "Total Overdue jobs");

			 System.out.println(driver.findElement(By.xpath(data.getData(4, 45, 2))).getText());    //Overdue status
			// test.log(LogStatus.INFO, "Overdue status");
			/* report.endTest(test);
			  report.flush();*/
	}	 
			 
	/*public void Pending(WebDriver driver1) throws InterruptedException {

		WebDriver driver = driver1;

		// Fleet-B HARUKA
		Thread.sleep(500);

		Select Fleet = new Select(driver.findElement(By.id("ctl00_MainContent_ddlFleet"))); // path for Fleet-B dropdown
		Fleet.selectByVisibleText("Fleet-B");
		Thread.sleep(3000);

		Select Vesseles = new Select(driver.findElement(By.id("ctl00_MainContent_ddlVessels"))); // path for HARUKA dropdown Vessels
		Vesseles.selectByVisibleText("HARUKA");
		Thread.sleep(3000);

		driver.findElement(By.id("ctl00_MainContent_ImgBtnSearch")).click(); // Search Button
		Thread.sleep(3000);

	}*/
	
	
	
	
	
	
	
	
	
		/*	 
			 // Pending and Overdue Check
			 
			 driver.findElement(By.id("ctl00_MainContent_rblJobStaus_1")).click();    // Pending Checkbox
			 Thread.sleep(3000);
			 
			 driver.findElement(By.id("ctl00_MainContent_ImgBtnSearch")).click();    // Search button
			 Thread.sleep(3000);
			 
			 //Total pending and overdue jobs
			 
			 System.out.println(driver.findElement(By.xpath(".//*[@id='Div1']/div[2]/table/tbody/tr/td[1]")).getText()); //Total jobs

             Select D = new Select(driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_ddlPageSize"))); // path for dropdown Page
             D.selectByIndex(5);
             Thread.sleep(3000);
			 
             driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk1")).click();    //1 page click
			 Thread.sleep(3000);
			 
			 int PENDING = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 1 total jobs
				Thread.sleep(3000);
				 System.out.println("page 1 pending jobs are "+ PENDING);
				 
				 driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk2")).click();    //2 page click
				 Thread.sleep(3000);
				 
				 int PENDING1 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();   //page 2 total jobs
					Thread.sleep(3000);
					 System.out.println("page 2 pending jobs are "+ PENDING1);
					 
					 
					 driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk3")).click();    //3 page click
					 Thread.sleep(3000);
					 
					 int PENDING2 = driver.findElements(By.xpath("//*[text()='PENDING']")).size(); //page 3 total jobs
						Thread.sleep(3000);
						 System.out.println("page 3 pending jobs are "+ PENDING2);
					int total = PENDING+ PENDING1 +PENDING2 ;
					 System.out.println("Total  pending overdue  jobs are "+ total);
					 
					 
					//Pending and Completed  
					 
					 
					 driver.findElement(By.id("ctl00_MainContent_rblJobStaus_5")).click();    //Uncheck Overdue Checkbox
					 Thread.sleep(3000);	 
					 
					 driver.findElement(By.id("ctl00_MainContent_rblJobStaus_2")).click();    // Completed Checkbox
					 Thread.sleep(3000);
					 
					 driver.findElement(By.id("ctl00_MainContent_ImgBtnSearch")).click();    // Search button
					 Thread.sleep(3000);	 
					 
					 //Total pending and Completed  jobs
					 
					 System.out.println(driver.findElement(By.xpath(".//*[@id='Div1']/div[2]/table/tbody/tr/td[1]")).getText()); //Total jobs
					 Thread.sleep(3000);	
					 
					 Select D1 = new Select(driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_ddlPageSize"))); // path for dropdown  Page
		             D1.selectByIndex(5);
		             Thread.sleep(3000);
		             
		             driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk1")).click();    //1 page click
					 Thread.sleep(3000);
					 
					 int PENDING3 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 1 total PENDING jobs
					 System.out.println("page 1 pending jobs are "+ PENDING3);
					Thread.sleep(3000);
					 
				   int COMPLETED = driver.findElements(By.xpath("//*[text()='COMPLETED']")).size();    //page 1 total COMPLETED jobs
			    	 System.out.println("page 1 COMPLETED jobs are "+ COMPLETED);
				     Thread.sleep(3000);
					 
				  driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk2")).click();    //2 page click
				 Thread.sleep(3000);
							 
					 int PENDING4 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 2 total PENDING jobs
					 System.out.println("page 2 pending jobs are "+ PENDING4);
			    	 Thread.sleep(3000);
							 
				 int COMPLETED1 = driver.findElements(By.xpath("//*[text()='COMPLETED']")).size();    //page 2 total COMPLETED jobs
						 System.out.println("page 2 COMPLETED jobs are "+ COMPLETED1);
						 Thread.sleep(3000);
					 
					 
				  driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk3")).click();    //3 page click
				 Thread.sleep(3000);
									 
				 int PENDING5 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 3total PENDING jobs
				System.out.println("page 3 pending jobs are "+ PENDING5);
				 Thread.sleep(3000);
									 
			    int COMPLETED2 = driver.findElements(By.xpath("//*[text()='COMPLETED']")).size();    //page 3 total COMPLETED jobs
				Thread.sleep(3000);
			   System.out.println("page 3 COMPLETED jobs are "+ COMPLETED2);
									 
				 int Total2 =PENDING3+COMPLETED+PENDING4 +COMPLETED1+PENDING5+COMPLETED2;			 
				  System.out.println("Total Pending and Completed jobs are "+ Total2);				 
											 
								//Pending Rework Check box			 
				     driver.findElement(By.id("ctl00_MainContent_rblJobStaus_2")).click();    // Uncheck Completed Checkbox
					 Thread.sleep(3000);
					 
					 driver.findElement(By.id("ctl00_MainContent_rblJobStaus_3")).click();    // Reworked Checkbox
					 Thread.sleep(3000);
					 
					 driver.findElement(By.id("ctl00_MainContent_ImgBtnSearch")).click();    // Search button
					 Thread.sleep(3000);							 
										
                       //Total pending and Reworked jobs
					 
					 System.out.println(driver.findElement(By.xpath(".//*[@id='Div1']/div[2]/table/tbody/tr/td[1]")).getText()); //Total jobs
					 Thread.sleep(3000);
					 
					 Select D2 = new Select(driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_ddlPageSize"))); // path for dropdown 100 Page
		             D2.selectByIndex(5);
		             Thread.sleep(3000);
		             
		             
		             driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk1")).click();    //1 page click
					 Thread.sleep(3000);
					 
					 int PENDING0 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 1 total PENDING jobs
					 System.out.println("page 1 pending jobs are "+ PENDING0);
					Thread.sleep(3000);
		             
		
					 int REWORKED = driver.findElements(By.xpath("//*[text()='REWORKED']")).size();    //page 1 total REWORKED  jobs
					 System.out.println("page 1  REWORKED jobs are "+ REWORKED);
					Thread.sleep(3000);
					
					
					 driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk2")).click();    //2 page click
					 Thread.sleep(3000);
								 
						 int PENDING6 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 2 total PENDING jobs
						 System.out.println("page 2 pending jobs are "+ PENDING6);
				    	 Thread.sleep(3000);
								 
					       int REWORKED1 = driver.findElements(By.xpath("//*[text()='REWORKED']")).size();    //page 2 total REWORKED jobs
							 System.out.println("page 2  REWORKEDD jobs are "+ REWORKED1);
							 Thread.sleep(3000);
					
							 driver.findElement(By.id("ctl00_MainContent_ucCustomPagerctp_lnk3")).click();    //3 page click
							 Thread.sleep(3000);
												 
							 int PENDING7 = driver.findElements(By.xpath("//*[text()='PENDING']")).size();    //page 3total PENDING jobs
							System.out.println("page 3 pending jobs are "+ PENDING7);
							 Thread.sleep(3000);
												 
						    int REWORKED2 = driver.findElements(By.xpath("//*[text()='REWORKED']")).size();    //page 3 total REWORKED jobs
							Thread.sleep(3000);
						   System.out.println("page 3 REWORKED jobs are "+ REWORKED2);
												 
							 int Total3 =PENDING0+REWORKED+ PENDING6 +REWORKED1+PENDING7+REWORKED2 ;			 
							  System.out.println("Total Pending and REWORKED jobs are "+ Total3);				 
														 
					
			*/
	
            
            
            
            
            
            
        
		
	
	
	
		
		

      	

			
	


		
		
		
		
		
	


	 
	private Object isTextPresent(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private WebElement getNumberText() {
		// TODO Auto-generated method stub
		return null;
	}

}