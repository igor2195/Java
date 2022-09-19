package practice;

import net.sf.saxon.expr.parser.Loc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        int counter = 0;
        final String DATE_PATTERN = "dd.MM.yyyy - EE";
        String text  = "";
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN).localizedBy(Locale.US);

        while (birthday.isBefore(today.plusDays(1))) {
            text  += counter + " - " + formatter.format(birthday) + System.lineSeparator();
            counter++;
            birthday= birthday.plusYears(1);

        }
        return text ;


    }
}
