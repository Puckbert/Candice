package integerArrays;

import java.util.Scanner;

public class IntegerArrays {

    public static void main(String[] args){
        int[] arr = einlesen();
        ausgeben(arr);
        System.out.println("Mittelwert: "+mittelwert(arr));
        System.out.println("Größter Wert: "+groesste(arr));
        arr = insertionSort(arr);
        ausgeben(arr);

        arr = reverse(arr);
        ausgeben(arr);
    }

    public static int[] einlesen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Werte sollen eingegeben werden: ");

        int groesse = sc.nextInt();
        int[] arr = new int[groesse];

        for(int i=0; i<groesse;i++){
            System.out.println("Geben Sie einen Wert ein für ["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void ausgeben(int[] refArray){
        for(int i=0; i<refArray.length; i++){
            System.out.println((i+1)+". "+refArray[i]);
        }
    }

    public static double mittelwert(int[] refArray){
        double summe = 0;
        for(int i=0; i<refArray.length; i++){
            summe+=refArray[i];
        }

        return summe/refArray.length;

    }

    public static int groesste(int[] refArray){
        int max = refArray[0];

        for (int i=1; i<refArray.length; i++){
            if(max < refArray[i]){
                max = refArray[i];
            }
        }
        return max;
    }

    public static int[] insertionSort(int[] refArray){
        int tmp;
        for (int i=1; i<refArray.length; i++) {
            for(int j=i ; j>0 ; j--){
                if(refArray[j] < refArray[j-1]){
                    tmp = refArray[j];
                    refArray[j] = refArray[j-1];
                    refArray[j-1] = tmp;
                }
            }
        }
        return refArray;
    }

    public static int[] reverse(int[] refArray){

        for(int i=0; i<refArray.length/2; i++){
            int temp = refArray[i];
            refArray[i] = refArray[refArray.length -i -1];
            refArray[refArray.length -i -1] = Math.abs(temp);
        }

        return refArray;

    }

}
