import java.util.Scanner;

public class AckermannFunktionRek {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie n ein: ");
        double n = sc.nextDouble();

        System.out.println("Geben Sie m ein: ");
        double m = sc.nextDouble();

        System.out.println(ackermann(n, m));
    }

    private static double ackermann(double n, double m){
        if (n == 0){
            return m+1;
        }else if (m == 0){
            return ackermann(n-1, 1);
        }else {
            return ackermann(n-1, ackermann(n, m-1));
        }
    }
}
