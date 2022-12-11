import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Girilen sayının asal olup olmadığını bulan program

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int sayi = input.nextInt();
        boolean sonuc = true;

        if (sayi == 1)
            System.out.println("1 sayısı asal değildir");

        if (sayi > 1) {
            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {
                    sonuc = false;
                    break;
                }

                if (sayi % i != 0) {
                    sonuc = true;
                }


            }
            if (sonuc == true)
                System.out.println("Sayı asaldır.");
            else
                System.out.println("Sayı asal değildir.");


        } else
            System.out.println("Yanlış değer girdiniz.");

    }
}