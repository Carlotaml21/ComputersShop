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

    @Test
    void shouldSetBrand(){
        assertEquals("Lenovo", computer.getBrand());
        computer.setBrand("HP");
        assertEquals("HP", computer.getBrand());
    }

    @Test
    void shouldGetStorage(){
        assertEquals(500, computer.getStorage());
    }

    @Test void shouldSetStorage(){
        assertEquals(500, computer.getStorage());
        computer.setStorage(1000);
        assertEquals(1000, computer.getStorage());
    }

    @Test
    void shouldGetOperatingSystem(){
        assertEquals("Windows", computer.getOperatingSystem());
    }

    @Test
    void shouldSetOperatingSystem(){
        assertEquals("Windows", computer.getOperatingSystem());
        computer.setOperatingSystem("Linux");
        assertEquals("Linux", computer.getOperatingSystem());
    }

    @Test
    void shouldGetCpuCharacteristics(){
        assertEquals("i7", computer.getCpuCharacteristics());
    }

    @Test
    void shouldSetCpuCharacteristics(){
        assertEquals("i7", computer.getCpuCharacteristics());
        computer.setCpuCharacteristics("Ryzen 9");
        assertEquals("Ryzen 9", computer.getCpuCharacteristics());
    }

    @Test
    void shouldGetPrice(){
        assertEquals(500.0, computer.getPrice());
    }

}
