package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Reporter;

public class Hooks {

    @Before
    public void setup() {
        Reporter.initReport();
    }

    @After
    public void teardown() {
        Reporter.flushReport();
    }
}
