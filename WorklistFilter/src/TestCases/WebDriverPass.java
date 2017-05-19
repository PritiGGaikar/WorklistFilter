package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import CommonFunction.RW;
import CommonFunction.loginpage;



public class WebDriverPass extends RW
{

 public static WebDriver driver;

 loginpage L = new loginpage(); //

 @BeforeSuite
 public void initialioseBrowser() throws Exception 
 {

  System.setProperty("webdriver.chrome.driver","C:\\Users\\Priti\\workspace\\chromedriver\\chrome32\\chromedriver.exe");
    
  driver = new ChromeDriver();
  
  //driver = new FirefoxDriver();

  driver.get(url);
  Thread.sleep(100);
 driver.manage().window().maximize();
 Thread.sleep(100); 
  L.Login(driver);

  Thread.sleep(100);

 }
 
/*@AfterMethod
 
 public void testreport(ITestResult testresult) throws Exception 
 { 
  try
  {
   
   if(testresult.getStatus()==ITestResult.SUCCESS)
   {
    
     System.out.println("Pass "+driver.getTitle()+"\n");
    
    
   }
    else if(testresult.getStatus() == ITestResult.FAILURE)
          {
              
     System.out.println("Fail "+driver.getTitle()+"\n");
              //Do your excel writing stuff here

          }
          else if(testresult.getStatus() == ITestResult.SKIP)
          {
 
            System.out.println("Skip "+driver.getTitle()+"\n");
          }  
  
  }
     catch(Exception e)
     {
         System.out.println("\nLog Message::@AfterMethod: Exception caught");
         e.printStackTrace();
     }
 }*/
 
 


 @AfterSuite
 public void closeBrowser() {

  // it is used for sending the email
  driver.quit();

 
 }
 

 


}