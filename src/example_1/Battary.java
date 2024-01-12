package example_1;

public class Battary {

    int batteryCapacity;
    final double migration=1.5;

    public Battary(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getMigration() {
        return migration;
    }
}
