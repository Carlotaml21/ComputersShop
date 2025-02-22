package carlotaml21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {

    private Computer computer;


    @BeforeEach
    void setUp(){
        computer = new Computer("Lenovo", 500, "Windows", "i7", 500.0);
    }

    @Test
    void shouldGetBrand(){
        assertEquals("Lenovo", computer.getBrand());


    }
}
