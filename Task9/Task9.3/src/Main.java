import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){
            String phoneNumber = new Scanner(System.in).nextLine();
            System.out.println(formatPhoneNumber(phoneNumber));
        }
    }

    /**
     * @param phone Принимает номер
     * @return Возвращает отформатированный номер под формат 7ХХХХХХХХХХ
     * Если номер не подходит под формат возвращает тектс "Неверный формат номера"
     */
    public static String formatPhoneNumber(String phone) {
        String clearRegex = "[^0-9]";
        String firstNumber = "[8][0-9]{10}";
        String regex = "[7][0-9]{10}";

        phone = phone.replaceAll(clearRegex, "");
        if (phone.matches(firstNumber)) {
            phone = phone.replace("8", "7");
        } if(phone.matches(regex)){
            return phone;
        } else return "Неверный формат номера";
    }
}
