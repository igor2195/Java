public class CheckAction {

    private static String[] str;

    public static void checkAction (String inputString) {
        str = inputString.split(" ");

        switch (str[0]) {
            case "ADD" -> EmailList.addList(str[1]);
            case "LIST" -> EmailList.getList();
        }
    }

}
