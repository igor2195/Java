import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<String> list = new TreeSet<>();

        while (true) {
            String inputString = new Scanner(System.in).nextLine();
            CheckAction.checkAction(inputString);
        }

    }
}
