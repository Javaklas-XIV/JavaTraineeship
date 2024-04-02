import lombok.Data;

@Data
public class Android extends Human implements Chargeable {

    private int batteryLevel = 0;

    public static final int MAX_BATTERY_LEVEL = 100;

    @Override
    public void greet() {
        System.out.println("I'm only half human, but human still... My energy level is " + this.batteryLevel + "%...");
    }

    @Override
    public int charge(int amount) {
        this.setBatteryLevel(amount);

        return this.getBatteryLevel();
    }

    public void setBatteryLevel(int amount) {
        int newBatteryLevel = this.batteryLevel + amount;

        if (newBatteryLevel > MAX_BATTERY_LEVEL)
            throw new IllegalArgumentException("Batterij kan niet hoger dan " + MAX_BATTERY_LEVEL + " procent worden opgeladen.");

        this.batteryLevel = newBatteryLevel;
    }
}
