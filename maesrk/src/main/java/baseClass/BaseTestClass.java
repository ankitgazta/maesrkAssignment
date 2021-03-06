package baseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTestClass() 
	{
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\maesrk\\maesrk\\config.properties");
		prop.load(fis);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void browserInitialization() {
		
		String browserName= prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(browserName.equals("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
}
