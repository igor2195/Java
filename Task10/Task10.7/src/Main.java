import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<StringBuilder> toDoList = new ArrayList<>();

        while (true) {
            String inputString = new Scanner(System.in).nextLine();
            ActionCase.action(inputString, toDoList);
        }
    }


}


