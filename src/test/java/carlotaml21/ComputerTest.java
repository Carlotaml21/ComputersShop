package carlotaml21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerTest {

    private Computer computer;


    @BeforeEach
    void setUp(){
        computer = new Computer("Lenovo", 500, "Windows", "i7", 500.0);
    }

    @Test
    void shouldGetBrand(){

    }
}
