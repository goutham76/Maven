package Bussiness;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("static-access")
public class Buss {


	static WebDriver driver=null;
	static String tcid= null;
	
	
	



	
	public Buss(WebDriver driver,String tcid){
		this.driver=driver;
		this.tcid=tcid;
	}
  


}



