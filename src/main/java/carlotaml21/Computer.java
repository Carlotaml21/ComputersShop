package carlotaml21;

public class Computer {

    private String brand;
    private int storage;
    public String operatingSystem;
    private String cpuCharacteristics;
    private double price;

    public Computer(String brand, int storage, String operatingSystem, String cpuCharacteristics, double price) {
        this.brand = brand;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.cpuCharacteristics = cpuCharacteristics;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = "brand";
    }
}
