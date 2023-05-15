import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testGetHello() {
        assertEquals(new Main().getHello(), "hello from Java");
    }

    @Test
    public void testGetSize() {
        assertEquals(new Main().getSize(), 15);
    }
}