public class Arithmetic{
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getMul(int a, int b) {
        return a * b;
    }

    public int getMax(Integer... number) {
        int max = 0;
        for (int i = 0; i < number.length; i++) {
           if(max < number[i]){
               max = number[i];
           }
        }
        return max;
    }

    public int getMin(Integer... number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if(min > number[i]){
                min = number[i];
            }
        }
        return min;
    }
}
