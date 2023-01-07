package flyweight;

public class Flyweight {
    private final SomeType enumValue;
    private Flyweight(SomeType enumValue) {
        this.enumValue = enumValue;
    }
    private static final Flyweight[] flyweightStorage = new Flyweight[SomeType.values().length];

    // static field that gets EXECUTED EXACTLY ONCE when class is loaded
    static {
        for (SomeType value: SomeType.values()) {
            flyweightStorage[value.ordinal()] = new Flyweight(value);
        }
    }

    public static Flyweight get(int valueNumber) {
        return flyweightStorage[valueNumber - 1];
    }

    // any Methods
    public void printValue() {
        System.out.println(enumValue);
    }
}
