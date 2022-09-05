public class Ram {
    private final TypeRam type;
    private final int volume;
    private final double weight;

    public Ram(TypeRam type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeRam getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }
}
