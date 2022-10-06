import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();

        System.out.println(sequentialWordsNumbers(text));


    }

    public static String sequentialWordsNumbers(String text) {

        StringBuilder resText = new StringBuilder();
        int index = 0;
        int count = 1;
        int space;

        while(index <= text.lastIndexOf("")) {
            space = text.indexOf(" ", index + 1);
            resText.append("(").append(count).append(") ");
            if(space == -1) {
                resText.append(text.substring(index));
                break;
            } else {
                resText.append(text, index, space + 1);
            }
            index = space + 1;
            count++;
        }


        return resText.toString();

    }
}
