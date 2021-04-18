import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest2 {
    @Test
    public void smokeTest2_1() {
        Assert.assertFalse(1>2,"1>2 is false");

    }
    @Test
    public void smokeTest2_2() {
        Assert.assertTrue(3>2,"3>2 is true");

    }
}
