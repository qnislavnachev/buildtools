package HelloWorldTest;

import hello.Greeter;
import org.junit.Test;

import static org.junit.Assert.*;

public class helloTest {
    @Test
    public void sayHello() throws Exception {
        Greeter greeter = new Greeter();
        assertTrue("Hello World!" == greeter.sayHello());
    }
}
