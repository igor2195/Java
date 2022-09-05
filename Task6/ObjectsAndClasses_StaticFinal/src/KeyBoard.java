public class KeyBoard {
    private final String type;
    private final boolean isBacklight;
    private final double weight;

    public KeyBoard(String type, boolean isBacklight, double weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public double getWeight() {
        return weight;
    }
}
