import java.util.*;

public class Main {
    public static void main(String[] args) {

        String regexName = "[a-zA-Z]+";
        String regexNumber = "[0-9]+";
        HashMap<String, TreeSet<String>> contactMap = new HashMap<>();
        TreeSet<String> phoneList = new TreeSet<>();

        phoneList.add("79788415853");
        contactMap.put("da",phoneList);

        System.out.println("Введите номер, имя или команду: ");
        String input = new Scanner(System.in).nextLine();;

        boolean b = input.matches(regexName) && !contactMap.containsKey(input);
        boolean a = input.matches(regexNumber) && !phoneList.contains(input);
        if(b) {
            System.out.println("Такого имени в телефонной книге нет." + "\n" + "Введите номер телефона для абонента “%s”:".formatted(input));
            String phoneNumber = new Scanner(System.in).nextLine();
            phoneList = new TreeSet<>(){{
                add(phoneNumber);
            }};
            contactMap.put(input,phoneList);
            System.out.println("Контакт сохранен!");

            System.out.println(contactMap);
        }

        System.out.println(contactMap.get("ne").contains("4444"));

    }

}



