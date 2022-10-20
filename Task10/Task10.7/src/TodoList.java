import java.util.ArrayList;

public class TodoList {
    static void getList(ArrayList<StringBuilder> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    static void addElementToList(ArrayList<StringBuilder> list, StringBuilder element) {
        list.add(element);
        System.out.println("Добавлено дело \"" + element + "\"");

    }

    static void addElementToList(ArrayList<StringBuilder> list, StringBuilder element, int index) {
        if (index > list.size()) {
            list.add(element);
            System.out.println("Добавлено дело \"" + element + "\"");
        } else {
            list.add(index, element);
            System.out.println("Добавлено дело \"" + element + "\"" + "На позицию: " + index);
        }
    }

    static void editList(ArrayList<StringBuilder> list, StringBuilder element, int index) {
        if (index < list.size()) {
            StringBuilder tmp = list.get(index);
            list.set(index, element);
            System.out.println("Дело \"" + tmp + "\"" + " заменено на \"" + element + "\"");
        } else System.out.println("Дело с таким номером не существует");
    }

    static void removeElement(ArrayList<StringBuilder> list, int index) {
        if (index <= list.size()) {
            StringBuilder tmp = list.get(index);
            list.remove(index);
            System.out.println("Дело \"" + tmp + "\" удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }
}
