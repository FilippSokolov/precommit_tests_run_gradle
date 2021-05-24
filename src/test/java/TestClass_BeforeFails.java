import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_BeforeFails {

    @BeforeTest
    public void before() throws InterruptedException {
        throw new InterruptedException();
    }

    @Test
    public void test() {
        Assert.assertFalse(false);
    }
}
