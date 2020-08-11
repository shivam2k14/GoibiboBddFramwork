package steps;




import java.io.IOException;
import java.text.ParseException;

import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;

import cucumber.api.java.Before;


public class BeforeActions  {

	public BeforeActions() throws IOException {
		TestData testdata=new TestData();

}

	@Before
    public static void setUp() throws ParseException {
    	System.out.println("Before Action");
    	TestData.CheckDate();
       SeleniumDriver.setUpDriver();
       
       
    }
}
