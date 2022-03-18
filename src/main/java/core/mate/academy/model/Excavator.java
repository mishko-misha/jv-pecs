package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int high;

    public Excavator() {
    }

    public Excavator(String name, String color, int high) {
        super(name, color);
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
