import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_BeforeMethod {

    @BeforeMethod
    public int before() {
        return 10 /0 ;
    }

    @Test
    public void test() {
        Assert.assertTrue(true);
    }
}
