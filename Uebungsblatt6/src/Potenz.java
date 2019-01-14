import java.util.Scanner;

public class Potenz {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Programm zur Berechnung der Potenz");

        System.out.println("Bitte geben Sie x ein: ");
        int x = sc.nextInt();

        System.out.println("Bitte geben Sie y ein: ");
        int y = sc.nextInt();

        System.out.println("Die Potenz von "+x+" und "+y+" ist gleich: "+Math.pow(x,y));
    }

}
