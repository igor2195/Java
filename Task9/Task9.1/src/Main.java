public class Main {
    /**
     * @param args
     * из Это просто текст, для примера работы программы преобразовать в
     * (1) Это (2) просто (3) текст, (4) для (5) примера (6) работы (7) программы
     */
    public static void main(String[] args) {
        String text = "Это просто текст, для примера работы программы";
        //(1) Это (2) просто (3) текст, (4) для (5) примера (6) работы (7) программы
        StringBuilder resText = new StringBuilder();
        int index = 0;
        int count = 1;
        int space;

        while(index >= 0) {
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

        System.out.println(resText);



    }
}
