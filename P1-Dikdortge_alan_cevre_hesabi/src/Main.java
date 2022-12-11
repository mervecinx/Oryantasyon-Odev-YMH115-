import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Kenar uzunlukları girilen bir dikdörtgenin isteğe göre alan7çevre sonucunu gösteren program

        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu girin: ");
        double kisaKenar = input.nextDouble();
        System.out.print("Uzun kenar uzunluğunu girin: ");
        double uzunKenar = input.nextDouble();

        System.out.println(" ");

        if (kisaKenar > 0 && uzunKenar > 0 && kisaKenar < uzunKenar) {

            System.out.println("Alan sonucu için 1, çevre sonucu için 2 giriniz. ");
            int secim = input.nextInt();

            if (secim == 1)
                System.out.println("Alan = " + (kisaKenar * uzunKenar));
            else if (secim == 2)
                System.out.println("Çevre = " + (2 * (kisaKenar + uzunKenar)));
            else
                System.out.println("yanlış değer girdiniz.");


        } else
            System.out.println("yanlış değer girdiniz.");


    }
}