import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[][] arr = getTwoDimensionalArray(7);

        for(String[] elem : arr) {
            System.out.println(Arrays.toString(elem));
        }
    }

    public static String[][] getTwoDimensionalArray(int size) {

        String[][] arr = new String[size][size];

        for(int i = 0; i < arr.length; i++) {
            arr[i][i] = "X";
            arr[i][arr.length - 1 - i] = "X";
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != "X"){
                    arr[i][j] = "";
                }
            }
        }
        return arr;
    }

}
