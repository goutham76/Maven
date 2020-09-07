package bussinessLogic.Mavenframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver =null;
	@Test
	@Parameters({"abc", "url"})
    public static void gou(@Optional("Abc")String abc, String url)
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GouthamPutha\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(abc);
    	driver.get(url);
    	driver.manage().window().maximize();
    }
}
