public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor -= 1;
    }

    public void moveUp() {
        currentFloor += 1;
    }

    /**
     * Метод перемещает лифт на заданный в параметре floor этаж, если он задан верно.
     * Если параметр у метода задан неверно, этаж остаеться тот же в консоль выводтися сообщение указан не верный этаж.
     * Этот метод может перемещать лифт только последовательно, по одному этажу,
     * Выводит в консоль текущий этаж после каждого перемещения между этажами
     *
     * @param floor параметр отвечающий за номер этажа
     */
    public void move(int floor) {
        if (currentFloor == floor) {
            System.out.println("Вы уже на: " + floor + " этаже");
        }

        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Указан не верный этаж");
            floor = currentFloor;
        }

        if (floor > currentFloor) {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        } else if (floor < currentFloor) {
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }

    }


}
