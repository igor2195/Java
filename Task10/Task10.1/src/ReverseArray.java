public class ReverseArray {
    public static void main(String[] args) {

        String[] arr = {"a","b","c","d","e"};
        reverse(arr);
        for(String index : arr) {
            System.out.println(index);
        }
    }

    /**
     * @param arr Принимает массив строк и меняет его элементы в обратном порядке
     */
    public static void reverse(String[] arr) {

        String tmp;

        for(int i = 0; i < arr.length / 2; i++) {
            tmp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = tmp;
        }
    }
}
