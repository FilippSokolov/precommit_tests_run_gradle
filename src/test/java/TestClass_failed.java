import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_failed {

    @Test
    public void fail() {
        Assert.assertSame("srtring", "dfdff");
    }
}
