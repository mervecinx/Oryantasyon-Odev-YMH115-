import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Girilen iki sayının birbirine bölümünden bölümü ve kalanı bulan program

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 > 0 && sayi2 > 0 && sayi1 > sayi2) {

            System.out.println("Bölüm = " + (sayi1 / sayi2));
            System.out.println("Kalan = " + (sayi1 % sayi2));


        } else
            System.out.println("yanlış değer girişi.");


    }
}