package HomeWork;

public class task1_2 {
    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        }
        return (double)a / b;
    }
}
