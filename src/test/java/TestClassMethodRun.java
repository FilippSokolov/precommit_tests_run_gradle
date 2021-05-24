import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassMethodRun {

    @Test
    public void fail() {
        Assert.assertSame("srtring", "dfdff");
    }
}
