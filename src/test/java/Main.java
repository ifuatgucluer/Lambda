import org.Calculate;

public class Main {
    public static void main(String[] args) {
        double result = execute(3, 8, new Calculate() {
            @Override
            public double execute(double first, double second) {
                return first + second;
            }
        });
    }

    private static double execute(double first, double second, Calculate calculate){
        return calculate.execute(first, second);
    }

}