import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void methodFails() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void methodPasses() {
        Assert.assertTrue(true);
    }
}
