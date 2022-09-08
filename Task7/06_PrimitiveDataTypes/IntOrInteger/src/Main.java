public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        //Костыльное решение :) переберая только определенные символы
        /*for(char c = 'А'; c <= 'я'; c++) {
            if(c == 'Ж'){
                System.out.println('Ё');
            } if(c == 'ж'){
                System.out.println('ё');
            }
            System.out.println(c);
        }*/


        for( int i = 0; i < 65536; i++){
            char c = (char) i;
            if(c == 'Ё' || c == 'ё'){
                System.out.println(c);
            } else if(c >= 'А' && c <= 'я'){
                System.out.println(c);
            }
        }


    }
}
