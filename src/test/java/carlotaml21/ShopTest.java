package carlotaml21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShopTest {

    private Shop shop;
    private List<Computer> computers;
    private Computer computer;

    @BeforeEach
    void setUp() {
        computers = new ArrayList<>();
        computer = new Computer("Lenovo", 500, "Windows", "i7", 500.0);
        computers.add(computer);
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

    @Test
    void shouldGetComputers() {
        assertEquals(computers, shop.getComputers());
    }

    @Test
    void shouldSetComputers() {
        List<Computer> newComputers = new ArrayList<>();
        newComputers.add(new Computer("HP", 1000, "Linux", "Ryzen 9", 1200.0));
        shop.setComputers(newComputers);
        assertEquals(newComputers, shop.getComputers());
    }

    @Test
    void shouldAddComputer(){
        assertEquals(1, shop.getComputers().size());
        Computer newComputer = new Computer ("apple", 2000, "macOS", "M1", 1500.0);

        assertTrue(shop.addComputer(newComputer));

        assertEquals("apple", shop.getComputers().get(1).getBrand());
        assertEquals(2000, shop.getComputers().get(1).getStorage());
        assertEquals("macOS", shop.getComputers().get(1).getOperatingSystem());

        assertEquals(2, shop.getComputers().size());

    }
    @Test
    void shouldDeleteComputer(){
        assertEquals(1, shop.getComputers().size());

        assertTrue(shop.deleteComputer(computer));
        assertEquals(0, shop.getComputers().size());
    }

    @Test
    void shouldFindByBrand(){
      List<Computer> levonoComputers = shop.findByBrand("Lenovo");

      assertEquals(1, levonoComputers.size());
      assertEquals(500,levonoComputers.get(0).getStorage());
    }

    @Test
    void shouldGetComputersInformation(){
        assertEquals(computers.toString(), shop.getComputersInformation());


    }






}
