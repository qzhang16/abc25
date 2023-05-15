import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestCase {
    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void getHello() {
        assertEquals("hello from Java", main.getHello());
    }

    @Test
    public void getSize() {
        assertEquals(15, main.getSize());
    }
}