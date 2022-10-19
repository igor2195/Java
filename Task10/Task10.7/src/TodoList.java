import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {

        ArrayList<StringBuilder> toDoList = new ArrayList<>();

        while (true) {
            String inputString = new Scanner(System.in).nextLine();
            action(inputString, toDoList);
        }
    }

    public static void action(String inputString, ArrayList<StringBuilder> list) {

        String regexp = "[0-9]";
        String actionCase = "";
        int index = -1;
        StringBuilder element = new StringBuilder();
        String[] stringElem = inputString.split(" ");

        if (stringElem.length >= 1) {
            actionCase = stringElem[0];
        }

        if (stringElem.length >= 2 && stringElem[1].matches(regexp)) {
            index = Integer.parseInt(stringElem[1]);
            for (int i = 2; i < stringElem.length; i++) {
                element.append(stringElem[i]).append(" ");
            }
        } else {
            for (int i = 1; i < stringElem.length; i++) {
                element.append(stringElem[i]).append(" ");
            }
        }

        switch (actionCase) {
            case "LIST":
                getList(list);
                break;
            case "ADD":
                if (!stringElem[1].matches(regexp)) {
                    addElementToList(list, element);
                } else {
                    addElementToList(list, element, index);
                }
                break;
            case "EDIT":
                editList(list, element, index);
                break;
            case "DELETE":
                removeElement(list, index);
                break;
            default:
                System.out.println("Введена не корректная команда");
        }
    }

    public static void getList(ArrayList<StringBuilder> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void addElementToList(ArrayList<StringBuilder> list, StringBuilder element) {
        list.add(element);
        System.out.println("Добавлено дело \"" + element + "\"");

    }

    public static void addElementToList(ArrayList<StringBuilder> list, StringBuilder element, int index) {
        if (index > list.size()) {
            list.add(element);
            System.out.println("Добавлено дело \"" + element + "\"");
        } else {
            list.add(index, element);
            System.out.println("Добавлено дело \"" + element + "\"" + "На позицию: " + index);
        }
    }

    public static void editList(ArrayList<StringBuilder> list, StringBuilder element, int index) {
        if (index < list.size()) {
            StringBuilder tmp = list.get(index);
            list.set(index, element);
            System.out.println("Дело \"" + tmp + "\"" + " заменено на \"" + element + "\"");
        } else System.out.println("Дело с таким номером не существует");
    }

    public static void removeElement(ArrayList<StringBuilder> list, int index) {
        if (index <= list.size()) {
            StringBuilder tmp = list.get(index);
            list.remove(index);
            System.out.println("Дело \"" + tmp + "\" удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }
}


