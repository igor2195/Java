public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 20.3);
        basket.add("coffee", 50, 2, 10.2);
        basket.print("Milk");
        //System.out.println(basket.getTotalPrice());

        Basket basket1 = new Basket();
        basket1.add("Water", 20, 1, 10.3);
        basket1.print("tomat");

        basket.clear();

        basket.print("Milk");
    }
}
