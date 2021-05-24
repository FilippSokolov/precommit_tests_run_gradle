import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass_AfterFails {

    @Test
    public void test() {
        Assert.assertFalse(false);
    }

    @AfterTest
    public void after() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}
