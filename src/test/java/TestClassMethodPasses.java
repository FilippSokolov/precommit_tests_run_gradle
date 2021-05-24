import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassMethodPasses {

    @Test(enabled = true)
    public void enabled() {
        Assert.assertSame("111", "111");
    }
}
