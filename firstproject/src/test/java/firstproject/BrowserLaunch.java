package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		
		
	//web driver manager by configuring dependencies in pom.xml 
		WebDriverManager.chromedriver().setup();
	//through path 
System.setProperty("webdriver.chrome.driver","C:\\Users\\mahan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
	
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver","C:/Users/mahan/Downloads/geckodriver-v0.33.0-win64/geckodriver.exe");
		FirefoxDriver driver2 = new FirefoxDriver();
		
		
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver","C:\\Users\\mahan\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		EdgeDriver driver3 = new EdgeDriver();
	}

}
