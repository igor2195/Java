public class Arithmetic{
    public int a;
    public int b;

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

    public int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public int getMin(int a, int b) {
        return a > b ? b : a;
    }
}
