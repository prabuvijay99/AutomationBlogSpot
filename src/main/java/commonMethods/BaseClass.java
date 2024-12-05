package commonMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	public Properties prop;
	public void setDriver(WebDriver driver) {
		tldriver.set(driver);

	}
	
	public WebDriver getDriver() {
		return tldriver.get();

	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void openApp(String browsername) throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("./src/main/resources/config/config.properties");
		prop.load(fis);
		
		switch(browsername.toLowerCase()) {
		
		case "chrome" : 
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> pref=new HashMap<>();
		pref.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", pref);
		setDriver(new ChromeDriver(options));
		break;
		
		case "edge" : setDriver(new EdgeDriver());break;
		
		case "firefox" : setDriver(new FirefoxDriver());break;
		
		default: System.out.println("Invalid Browser");return;
		}
		
		getDriver().manage().window().maximize();
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
//	@AfterMethod
//	public void closeApp() {
//		getDriver().quit();
//
//	}

}


