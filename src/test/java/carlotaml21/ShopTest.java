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


}
