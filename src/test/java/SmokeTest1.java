import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class SmokeTest1 {
    private static Logger logger= Logger.getLogger(SmokeTest1.class);
    @Test(priority = 2,groups = {"p1"})
    public void smokeTest1_2() {
        logger.info("Entering SmokeTest1_2");
        Assert.assertTrue(3>2,"3>2 is true");
        logger.info("Exiting SmokeTest1_2");
    }
    @Test(priority = 1,groups = "p1")
    public void smokeTest1_1() {
        logger.info("Entering SmokeTest1_1");
        Assert.assertFalse(1 > 2, "1>2 is false");
        logger.info("Exiting SmokeTest1_1");
    }
    @Test(priority = 3,groups = "p2")
    public void smokeTest1_3() {
        logger.info("Entering SmokeTest1_1");
        Assert.assertFalse(1 > 2, "1>2 is false");
        logger.info("Exiting SmokeTest1_1");
    }
    @BeforeSuite
    public void beforesuit(){
     BasicConfigurator.configure();
        logger.info("Entering Suite");
    }
}
