public class Electricity {
    public int current, voltage, resistance;
    public int power;

    public Electricity() {
        
    }

    public Electricity(int power) {
        this.power = power;
    }

    public int getPower() {
        return current * voltage;
    }
}