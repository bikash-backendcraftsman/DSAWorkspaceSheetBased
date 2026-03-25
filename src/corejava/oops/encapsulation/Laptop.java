package corejava.oops.encapsulation;

public class Laptop {
    // Use strong types instead of free-form String
    private final int storageGb; // (memory/storage)
    private final int ramGb;

    // Constructor validates at boundary (object birth)

    /**
     * 📌 Rule
     *
     * Validation that defines object existence belongs in constructor.
     *
     */
    public Laptop(int storageGb, int ramGb) {
        if (storageGb <= 0) throw new IllegalArgumentException("Storage must be > 0 GB");
        if (ramGb <= 0) throw new IllegalArgumentException("RAM must be > 0 GB");
        if (ramGb % 2 != 0) throw new IllegalArgumentException("RAM should be even (common real-world constraint)");

        this.storageGb = storageGb;
        this.ramGb = ramGb;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public int getRamGb() {
        return ramGb;
    }

    // Optional: behavior-based methods (no generic setters)
    public Laptop upgradeRamTo(int newRamGb) {
        if (newRamGb <= this.ramGb) {
            throw new IllegalArgumentException("New RAM must be greater than current RAM");
        }
        return new Laptop(this.storageGb, newRamGb);
    }

    @Override
    public String toString() {
        return "Laptop{storageGb=" + storageGb + ", ramGb=" + ramGb + "}";
    }

    // Demo
    public static void main(String[] args) {
        Laptop lp = new Laptop(512, 16);
        System.out.println(lp.getStorageGb());
        System.out.println(lp.getRamGb());

        Laptop upgraded = lp.upgradeRamTo(32);
        System.out.println(upgraded);
    }

    /**
     * Why this is good design (quick):
     *
     * Validates at the boundary (constructor) → object can’t be born invalid
     *
     * Uses correct types (int GB) → avoids "null", "16gb", "sixteen" problems
     *
     * No setters → state can’t be corrupted after creation
     *
     * Behavior method (upgradeRamTo) → intent-based change with rules enforced inside
     */
}
