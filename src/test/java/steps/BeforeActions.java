package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumDriverBaseClass;

public class BeforeActions {

	@Before
	public void beforeAction(){
		SeleniumDriverBaseClass.setUpDriver();
	}
	
	@After
	public void tearDownAction(){
		SeleniumDriverBaseClass.tearDown();
	}
}
