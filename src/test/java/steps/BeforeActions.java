package steps;




import com.goibibo.qa.util.SeleniumDriver;

import cucumber.api.java.Before;


public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
