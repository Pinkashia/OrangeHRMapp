package OrangeHRM.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static void initialization() throws IOException, InterruptedException
	{
		try {
			//1. Read file using file handling
			String path= System.getProperty("user.dir")+"\\src\\test\\java\\OrangeHRM\\configuration\\config.properties";
			FileInputStream fs= new FileInputStream(path);
			prop = new Properties();
			prop.load(fs);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not available");
		}
		//2.create properties class object to read this file object
		System.setProperty("webdriver.chrome.driver", "E:\\Projects_Reference_Data-Bootcamp\\Selenium_API\\OrangeHRM\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		// properties object can be used to fetch the value using getProperty method
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void terminate()
	{
		driver.quit();
	}

}
