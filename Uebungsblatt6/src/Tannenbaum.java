import java.util.Scanner;

public class Tannenbaum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Höhe des Baumes ein: ");

        int hoehe = sc.nextInt();

        if (hoehe < 2){
            System.out.println("Die Höhe muss mind 2 betragen!");
        } else {
            drawTree(hoehe);
        }
    }

    /**
     * Zeichnet mit einer eingegebenen Höhe einen propretären Tannenbaum
     * in die Konsole.
     *
     * Der Tannenbaum ergibt nur Sinn, wenn die Höhe mehr als 2 beträgt.
     * Dies wird in der main-Methode abgefangen
     *
     * @param hoehe Gibt die Hoehe des Tannenbaums an
     */

    private static void drawTree(int hoehe) {
        int zeilen, spalten;
        /**
         * Wir verwenden Zeilen und Spalten und erstellen damit eine Matrix in die wir den Baum zeichnen
         */

        //Krone zeichnen
        for(zeilen = 1; zeilen<=hoehe; zeilen++){

            for(spalten = 1; spalten <= hoehe -zeilen; spalten++){
                System.out.print(" ");
            }

            for(spalten = 1; spalten <= (2*zeilen-1); spalten++){
                System.out.print("*");
            }

            System.out.println();
        }

        // Stamm zeichnen
        for(zeilen = 1; zeilen < hoehe; zeilen++){
            System.out.print(" ");
        }

        System.out.println("#");

    }
}