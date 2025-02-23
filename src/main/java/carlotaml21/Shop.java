package carlotaml21;

import java.util.List;
import java.util.ArrayList;

public class Shop {
    private int id;
    private String name;
    private String owner;
    private List<Computer> computers;

    public Shop(int id, String name, String owner, List<Computer> computers) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.computers =  (computers != null) ? computers : new ArrayList<>();
    }

    public int getId() {
        return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
