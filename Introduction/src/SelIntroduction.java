import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this for chrome launch
		System.setProperty("webdriver.driver.chrome","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		//--remote-allow-origins=*
		
        ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//webdriver.driver.chrome->checks for path
	    WebDriver driver=new ChromeDriver(options);
	    
		/*
	    //for firefox launch 
		//geckodriver.driver.Firefox//C:\\Users\\Dell\\Downloads\\geckodriver-v0.32.2-win-aarch64
		System.setProperty("webdriver.driver.gecko","C:\\Users\\Dell\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver");
		WebDriver driver=new FirefoxDriver();
		*/
	    /*
	    //for microsoft edge launch
	    System.setProperty("webdriver.driver.edge","C:\\Users\\Dell\\Downloads\\edgedriver_win64\\msedgedriver");
	    WebDriver driver=new EdgeDriver();
	    */
	    
	    
	    driver.get("https://rahulshettyacademy.com");
	    System.out.println(driver.getTitle());//get the title for the current page//to log the output to console use System.out.println() 
	   
	    //to check wether the actual url is maching with expected ,bcs we dont know wether url hacked or not
	    System.out.println(driver.getCurrentUrl());
	    
	    //driver.close();
	    //driver.quit();//if our script has multiple window to open we should use quit to close all 
	}

}
