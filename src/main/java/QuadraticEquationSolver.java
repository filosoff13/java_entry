import java.util.Arrays;

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        int discriminant = (int)Math.pow(b,2) - (4*a*c);
        if (discriminant > 0){
            double[] result = new double[2];
            result[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            result[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            return result;
        }
        else if (discriminant == 0){
            double[] result = new double[1];
            result[0] = -b / (2.0 * a);
            return result;
        }

        return new double[0];
    }

    public String evenOrOdd(int number) {
        return (number%2 == 0) ? "even" : "odd";
//        if (number%2 == 0) {
//            return "even";
//        } else {
//            return "odd";
//        }
    }
    //Test output
    public static void main(String[] args) {
        QuadraticEquationSolver ship = new QuadraticEquationSolver();


        System.out.println(Arrays.toString(ship.solve(1, -12, 36)));
    }
}
