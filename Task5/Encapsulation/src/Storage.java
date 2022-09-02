public class Storage {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean invertible;
    private final String number;
    private final boolean fragile;


    public Storage(Dimensions dimensions, double weight, String address, boolean invertible, String number, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.invertible = invertible;
        this.number = number;
        this.fragile = fragile;
    }

    public Storage setAddress(String address){
        return new Storage(dimensions, weight, address, invertible, number, fragile);
    }

    public Storage setWeight(double weight) {
        return new Storage(dimensions, weight, address, invertible, number, fragile);
    }

   public Storage setDimensions(Dimensions dimensions) {
        return new Storage(dimensions, weight, address, invertible, number, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isInvertible() {
        return invertible;
    }

    public String getNumber() {
        return number;
    }

    public boolean isFragile() {
        return fragile;
    }
}
