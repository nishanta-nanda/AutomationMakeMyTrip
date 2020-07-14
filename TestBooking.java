package testingBook;


import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class TestBooking {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:/Users/DELL/workspace/AutomationMakeMyTrip/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.makemytrip.com/";
        String expectedTitle = "";
        String actualTitle = "";

        // launch chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.findElement(By.xpath("//td[@fare-date='10-07-2020']")).click();

       
        //close Fire fox
        driver.close();
       
    }

	// TODO Auto-generated method stub

	}


