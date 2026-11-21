package Design Pattern.Builder Design Pattern;

class Computer {
    // all fields, can be made final for immutability
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;
    private final boolean bluetooth;
    private final boolean wifi;

    // private constructor — only the Builder can create a Computer
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    @Override
    public String toString() {
        return "Computer[cpu=" + cpu + ", ram=" + ram + ", storage=" + storage +
               ", gpu=" + gpu + ", bluetooth=" + bluetooth + ", wifi=" + wifi + "]";
    }

    // ---- Static nested Builder class ----
    public static class Builder {
        // required
        private final String cpu;
        private final String ram;
        // optional — given defaults
        private String storage = "No storage";
        private String gpu = "No GPU";
        private boolean bluetooth = false;
        private boolean wifi = false;

        // required fields must be passed to the Builder's constructor
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;   // enables chaining
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        // validation can go here before building!
        public Computer build() {
            if (cpu == null || ram == null) {
                throw new IllegalStateException("CPU and RAM are mandatory");
            }
            return new Computer(this);
        }
    }
}
//client code
public class withBuilder {
    public static void main(String[] args) {
        // Crystal clear — every field is named, order doesn't matter, skip what you don't need
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                                .storage("1TB SSD")
                                .gpu("RTX 4080")
                                .wifi(true)
                                .build();

        Computer officePC = new Computer.Builder("Ryzen 5", "8GB")
                                .storage("256GB SSD")
                                .wifi(true)
                                .build();   // no gpu, no bluetooth — uses defaults, totally fine

        // Even minimal is valid — only required fields
        Computer basicPC = new Computer.Builder("Celeron", "4GB").build();

        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(basicPC);
    }
}
