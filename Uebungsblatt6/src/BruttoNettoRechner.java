import java.util.Scanner;

public class BruttoNettoRechner {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Bruttobetrag ein: ");
        double brutto = sc.nextDouble();

        double netto = brutto * 1.19;

        System.out.print("Bruttobetrag: \t\t\t\t = \t" + String.format("%08.2f", brutto) + " EUR");
        System.out.print("\nUmsatzsteuersatz 19.00%: \t = \t"+ String.format("%08.2f",(netto - brutto)) +" EUR");
        System.out.print("\nNettobetrag: \t\t\t\t = \t" + String.format("%08.2f",netto) + " EUR");
    }

}
