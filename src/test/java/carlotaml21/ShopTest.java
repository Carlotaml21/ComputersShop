package carlotaml21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShopTest {

    private Shop shop;
    private List<Computer> computers;

    @BeforeEach
    void setUp() {
        computers = new ArrayList<>();
        computers.add(new Computer("Lenovo", 500, "Windows", "i7", 500.0));
        shop = new Shop(76589, "carloTICshop", "Carlota", computers);
    }

    @Test
    void shouldGetId() {
        assertEquals(76589, shop.getId());
    }

    @Test
    void shouldSetId() {
        assertEquals(76589, shop.getId());
        shop.setId(12345);
        assertEquals(12345, shop.getId());
    }

    @Test
    void shouldGetName() {
        assertEquals("carloTICshop", shop.getName());
    }

    @Test
    void shouldSetName() {
        assertEquals("carloTICshop", shop.getName());
        shop.setName("PCcomponentes");
        assertEquals("PCcomponentes", shop.getName());
    }

    @Test
    void shouldGetOwner() {
        assertEquals("Carlota", shop.getOwner());
    }

    @Test
    void shouldSetOwner() {
        assertEquals("Carlota", shop.getOwner());
        shop.setOwner("Arancha");
        assertEquals("Arancha", shop.getOwner());
    }




}
