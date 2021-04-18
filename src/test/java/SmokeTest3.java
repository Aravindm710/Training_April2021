import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest3 {
    @Test
    public void smokeTest3_1() {
        Assert.assertFalse(1>2,"1>2 is false");

    }
    @Test
    public void smokeTest3_2() {
        Assert.assertTrue(3>2,"3>2 is true");

    }
}
