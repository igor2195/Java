import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Код для каласса Elevator
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        //Код для калсса Storage и Dimensions
        Dimensions dim1 = new Dimensions(2,2,2);
        Storage stor1 = new Storage(dim1,25,"asd", false, "3q", true);
        Storage stor2 = stor1.setAddress("asd");
        System.out.println(stor1.equals(stor2));

    }
}
