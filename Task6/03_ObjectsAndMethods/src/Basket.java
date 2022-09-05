public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    /**
     * Переменная содержащая количество корзин
     */
    public static int countBaskets = 0;
    /**
     * Переменная содержащая общую стоимость всех товаров во всех корзинах
     */
    public static int totalCostBaskets = 0;
    /**
     * Переменная содержащая общее количество всех товаров во всех корзинах
     */
    public static int totalNumberProductsBaskets = 0;


    public Basket() {
        countBaskets += 1;
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
        this.totalPrice = totalPrice;
    }

    /**
     * Увеличивает значение общей стоимости totalCostBaskets во всех корзинах
     */
    public static void increaseTotalСostBaskets(int totalCostBaskets){
        Basket.totalCostBaskets += totalCostBaskets;
    }

    /**
     * Увеличивает значение общего количества всех товаров во всех корзинах
     */
    public static void increaseTotalNumberProductsBaskets() {
        Basket.totalNumberProductsBaskets ++;
    }

    /**
     * @return возвращает средную цену товара во всех корзинах
     */
    public static int getAvgPriceOfAllBaskets() {
        return Basket.totalCostBaskets / Basket.totalNumberProductsBaskets;
    }

    /**
     * @return Возвращает средную стоимость коризны
     */
    public static int getAvgPriceOfBasket() {
        return Basket.totalCostBaskets / Basket.countBaskets;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items += "\n" + name + " - " + count + " шт. - " + price + " руб.";
        totalPrice += count * price;
        totalWeight += weight * count;
        increaseTotalСostBaskets(totalPrice);
        totalPrice = 0;
        increaseTotalNumberProductsBaskets();
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public static int getCountBaskets() {
        return countBaskets;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(
                    items + "\n" + "Вес корзины: " + getTotalWeight() + " кг." + "\n" +
                    "Общая кол-во корзины: " + countBaskets + "\n" +
                    "Общая цена: " + totalCostBaskets + " руб." + "\n" +
                    "Общее число товаров в корзинах: " + totalNumberProductsBaskets + "\n" +
                    "Средняя цена товаров во всех корзинах: " + getAvgPriceOfAllBaskets() + "\n" +
                    "Средняя стоимость корзины: " + getAvgPriceOfBasket() + "\n"
            );
        }
    }
}
