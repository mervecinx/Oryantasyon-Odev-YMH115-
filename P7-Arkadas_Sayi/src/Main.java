import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Girilen iki sayının arkadaş sayı olup olmadıklarını bulan program
        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        int sayi2 = input.nextInt();
        int top1 = 0, top2 = 0;
        System.out.println(" ");

        if (sayi1 > 0 && sayi2 > 0) {

            for (int i = 1; i < sayi1; i++) {
                if (sayi1 % i == 0) {
                    top1 = top1 + i;
                }
            }

            for (int k = 1; k < sayi2; k++) {
                if (sayi2 % k == 0) {
                    top2 = top2 + k;
                }
            }

            if ((sayi1 == top2) && (sayi2 == top1))
                System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılardır.");
            else
                System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayı değillerdir.");


        } else
            System.out.println("Yanlış değer girdiniz.");


    }
}