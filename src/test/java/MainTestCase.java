import static org.junit.Assert.*;

public class MainTestCase {
Main main;
    @org.junit.Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @org.junit.Test
    public void getHello() {
        assertEquals("hello from Java", main.getHello());
    }

    @org.junit.Test
    public void getSize() {
        assertEquals(15,main.getSize());
    }
}