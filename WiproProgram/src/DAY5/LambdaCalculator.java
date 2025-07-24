package DAY5;

interface LambdaCalculator1 {
    double add(double a, double b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        LambdaCalculator1 addition = (a, b) -> {
            System.out.println("addition");
            double result = a + b;
            System.out.println("result " + result);
            return result;
        };

        LambdaCalculator1 subtract = (a, b) -> a - b;

        double a = 1000.0, b = 2000.0;
        addition.add(a, b);
        System.out.println("Subtract " + subtract.add(a, b));
    }
}