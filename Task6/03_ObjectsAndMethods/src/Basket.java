public class Basket {


    /**
     * Переменная содержащая количество корзин
     */
    public static int countOfBaskets = 0;
    /**
     * Переменная содержащая общую стоимость всех товаров во всех корзинах
     */
    public static int totalPrice = 0;
    /**
     * Переменная содержащая общее количество всех товаров во всех корзинах
     */
    public static int totalCount = 0;
    private static int count;
    private String items = "";
    private int price;
    private int limit;
    private double weight;


    public Basket() {
        countOfBaskets += 1;
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.price = totalPrice;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 1);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = contains(name);

        if (this.price + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items += "\n" + name + " - " + count + " шт. - " + price + " руб.";

        this.price += count * price;
        this.weight += weight * count;

        increaseTotalCostBaskets(count * price);
        increaseProductsQuantityInBaskets(count);
    }

    public void clear() {

        totalPrice -= price;
        totalCount -= count;

        items = "";
        price = 0;
        weight = 0;
    }

    /**
     * Увеличивает значение общей стоимости totalCostBaskets во всех корзинах
     */
    public static void increaseTotalCostBaskets(int totalCostBaskets){
        Basket.totalPrice += totalCostBaskets;
    }

    /**
     * Увеличивает значение общего количества всех товаров во всех корзинах
     */
    public static void increaseProductsQuantityInBaskets(int count) {
        Basket.totalCount += count;
    }

    /**
     * @return возвращает средную цену товара во всех корзинах
     */
    public static int getAvgPriceOfAllBaskets() {
        return Basket.totalPrice / Basket.totalCount;
    }

    /**
     * @return Возвращает средную стоимость коризны
     */
    public static int getAvgPriceOfBasket() {
        return Basket.totalPrice / Basket.countOfBaskets;
    }

    public static int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public static int getCountOfBaskets() {
        return countOfBaskets;
    }

    public double getWeight() {
        return weight;
    }

    private boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(
                    items + "\n" + "Вес корзины: " + getWeight() + " кг." + "\n" +
                    "Общая кол-во корзины: " + countOfBaskets + "\n" +
                    "Общая цена: " + totalPrice + " руб." + "\n" +
                    "Общее число товаров в корзинах: " + totalCount + "\n" +
                    "Средняя цена товаров во всех корзинах: " + getAvgPriceOfAllBaskets() + "\n" +
                    "Средняя стоимость корзины: " + getAvgPriceOfBasket() + "\n"
            );
        }
    }
}
