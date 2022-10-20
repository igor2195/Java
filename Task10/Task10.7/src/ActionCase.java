import java.util.ArrayList;

public class ActionCase {
    static void action(String inputString, ArrayList<StringBuilder> list) {

        String regexp = "[0-9]+";
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
                TodoList.getList(list);
                break;
            case "ADD":
                if (!stringElem[1].matches(regexp)) {
                    TodoList.addElementToList(list, element);
                } else {
                    TodoList.addElementToList(list, element, index);
                }
                break;
            case "EDIT":
                TodoList.editList(list, element, index);
                break;
            case "DELETE":
                TodoList.removeElement(list, index);
                break;
            default:
                System.out.println("Введена не корректная команда");
        }
    }
}
