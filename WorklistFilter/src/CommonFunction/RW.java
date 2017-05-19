
package CommonFunction;



/**
 * @author Amit
 *
 */
public class RW
{

 public ExcelRead data = new ExcelRead("C:\\Users\\Priti\\workspace\\WorklistFilter\\Excel\\Book14.xlsx"); // Read excel path

 public WriteExcel write_data = new WriteExcel("C:\\Users\\Priti\\workspace\\WorklistFilter\\Excel\\Book14.xlsx");

 public String url = data.getData(0, 1, 1); // get the url from excel sheet

 public String Dashboard = data.getData(0, 2, 1); // get url for dashboard page while any page is crashed

}