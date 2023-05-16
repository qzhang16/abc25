import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainIT {
    @Test
    void getHelloIT() {
        System.out.println("Integration test here...");
        assertEquals(15,new Main().getSize());
    }
}
