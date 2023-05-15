import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        main = new Main();
    }

    @org.junit.jupiter.api.Test
    void getHello() {
        assertEquals("hello from Java", main.getHello());
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        assertEquals(15,main.getSize());
    }
}