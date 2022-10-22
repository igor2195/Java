import java.util.HashSet;
import java.util.TreeSet;

public class EmailList {
    private static TreeSet<String> emailList = new TreeSet<>();

    public static void addList(String email) {
        if(ValidateEmail.validate(email)) {
            emailList.add(email);
        } else System.out.println("Не верный формат ввода email");

    }

    public static void getList() {
        for(String email : emailList) {
            System.out.println(email);
        }
    }
}
