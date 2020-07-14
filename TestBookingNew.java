package testingBook;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import demo.GetDatesJava;

public class TestBookingNew {

	public static void main(String[] args) throws InterruptedException {
		

	 //TODO Auto-generated method stub
	
        
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/workspace/AutomationMakeMyTrip/chromedriver_win32/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&campaign=DF-Brand-EM&gclid=EAIaIQobChMImKvV2v-02QIViZa9Ch0N1APSEAAYASAAEgKWQ_D_BwE");

		//Locate & Input the From City
		
		WebElement RTrip=browser.findElement(By.xpath("//input[@id=('gosuggest_inputSrc')]"));
		RTrip.click();
				
				
		//Locate & Input From City
		
		WebElement From_City = browser.findElement(By.id("gosuggest_inputSrc"));
		From_City.sendKeys("Bangalore (BLR)");
		
		From_City.sendKeys(Keys.RETURN);
		
		Thread.sleep(4000);
		
		
		//Locate & Input the To City
		WebElement To_City = browser.findElement(By.id("gosuggest_inputDest"));
		To_City.sendKeys("Delhi (DEL)");
		To_City.sendKeys(Keys.RETURN);
		
		Thread.sleep(4000);
		
		
		//Get the Depart & Return Date from GetDateinJava
		
		WebElement Dep=browser.findElement(By.xpath("//*[@id='departureCalendar']"));
		Dep.click();
		
		//FlightBooking x = new FlightBooking();
		//String ddatee = x.getSourceDate();
		
		//WebElement DepDate=browser.findElement(By.xpath("//spanid[@id=('price_'+dday)]"));
		Dep.sendKeys("Mon, 20 Jul");
		
		//Locate & Enter the Depart Date
		
		//Locate & Enter the Return Date
		
		//Click on Get Set Go
		
		//
		
	}
	}        

