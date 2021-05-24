import org.testng.annotations.Test;

public class TestClass_expectedException {

    NullPointerException npe = new NullPointerException();


    @Test(expectedExceptions = NullPointerException.class)
    public void test() {
        throw npe;
    }
}
