import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputString = new Scanner(System.in).nextLine();
        System.out.println(splitText(inputString));

        /*
        или через регулярное выражене, разбив по пробелу
        String[] words = inputString.split("\\s+");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }*/
    }

    /**
     * @param inputString исходная строка
     * @return возвращает слова из исходной строки разбитые через \n по пробелу
     */
    public static String splitText(String inputString) {

        int currentIndex = 0;
        int lastStringIndex = inputString.lastIndexOf("");
        int spaceIndex;

        String newLine = System.lineSeparator();
        StringBuilder outString = new StringBuilder();


        while (currentIndex <= lastStringIndex) {
            spaceIndex = inputString.indexOf(" ", currentIndex);

            if (spaceIndex == -1) {
                outString.append(inputString.substring(currentIndex));
                break;
            } else {
                outString.append(inputString, currentIndex, spaceIndex).append(newLine);
            }
            currentIndex = spaceIndex + 1;

        }
        return outString.toString();
    }
}
