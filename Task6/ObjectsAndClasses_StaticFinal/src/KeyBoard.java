public class KeyBoard {
    private final TypeKeyBoard type;
    private final boolean isBacklight;
    private final double weight;

    public KeyBoard(TypeKeyBoard type, boolean isBacklight, double weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public TypeKeyBoard getType() {
        return type;
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public double getWeight() {
        return weight;
    }
}
