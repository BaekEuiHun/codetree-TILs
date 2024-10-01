public class Main {
    public static void main(String[] args) {
        int a = 13;
        String b = String.format("%.3f", 0.165);
        double result = a * b;
        System.out.printf(a + " * " + b + " = " + "%.6f", result);
    }

}