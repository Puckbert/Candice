import java.util.Scanner;

public class AutoAlter {
    public static void main(String [] args){
        int produktionsdatum = eingabeProduktionsdatum();
        int alter = alterBerechnung(produktionsdatum);
        ausgabeAlter(alter);
    }

    public static int eingabeProduktionsdatum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben Sie das Produktionsjahr (in der Form yyyy) ein: ");
        int alter = sc.nextInt();

        return alter;
    }

    public static int alterBerechnung(int produktionsJahr){
        return 2019 - produktionsJahr;
    }

    public static void ausgabeAlter(int alter){
        System.out.print("\nDas Auto ist heute "+alter+" Jahre alt.");
    }


}
