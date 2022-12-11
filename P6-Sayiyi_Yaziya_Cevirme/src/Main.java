import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Girilen iki basamaklı sayıyı metinsel olarak ekrana yazan program
        Scanner input = new Scanner(System.in);
        System.out.print("İki basmaklı bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            sayi = sayi * (-1);
            System.out.print("Eksi ");
        }

        int onlar = sayi / 10;
        int birler = sayi % 10;

        switch (onlar) {
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kırk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmış ");
                break;
            case 7:
                System.out.print("Yetmiş ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");

        }
        switch (birler) {
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("Bir ");
                break;
            case 2:
                System.out.print("İki ");
                break;
            case 3:
                System.out.print("Üç ");
                break;
            case 4:
                System.out.print("Dört ");
                break;
            case 5:
                System.out.print("Beş ");
                break;
            case 6:
                System.out.print("Altı ");
                break;
            case 7:
                System.out.print("Yedi ");
                break;
            case 8:
                System.out.print("Sekiz ");
                break;
            case 9:
                System.out.print("Dokuz ");

        }

    }
}