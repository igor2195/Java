public class Storage {
    private final TypeStorage typeStorage;
    private final int memoryCapacity;
    private final double weight;

    public Storage(TypeStorage typeStorage, int memoryCapacity, double weight) {
        this.typeStorage = typeStorage;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public TypeStorage getTypeStorage() {
        return typeStorage;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public double getWeight() {
        return weight;
    }
}
