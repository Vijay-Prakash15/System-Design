package Design Pattern.Builder Design Pattern;

class Computer {
    // required
    private String cpu;
    private String ram;
    // optional
    private String storage;
    private String gpu;
    private boolean bluetooth;
    private boolean wifi;

    // Constructor 1 - only required fields
    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    // Constructor 2 - required + storage
    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    // Constructor 3 - required + storage + gpu
    public Computer(String cpu, String ram, String storage, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }

    // Constructor 4 - required + storage + gpu + bluetooth
    public Computer(String cpu, String ram, String storage, String gpu, boolean bluetooth) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.bluetooth = bluetooth;
    }

    // Constructor 5 - ALL fields
    public Computer(String cpu, String ram, String storage, String gpu, boolean bluetooth, boolean wifi) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "Computer[cpu=" + cpu + ", ram=" + ram + ", storage=" + storage +
               ", gpu=" + gpu + ", bluetooth=" + bluetooth + ", wifi=" + wifi + "]";
    }
}

public class withOutBuilder {
    public static void main(String[] args) {
        // Problem 1: what if I want wifi=true but NOT bluetooth? No constructor for that combo!
        // Problem 2: unreadable — what do these booleans even mean?
        Computer c1 = new Computer("Intel i7", "16GB", "512GB SSD", "RTX 3060", true, false);

        // Problem 3: forced to pass gpu=null just to reach the bluetooth param
        Computer c2 = new Computer("Ryzen 5", "8GB", "256GB SSD", null, true);

        System.out.println(c1);
        System.out.println(c2);
    }
}
