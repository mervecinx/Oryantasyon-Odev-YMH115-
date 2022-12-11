import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Basit hesap makinesi (switch-case)
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println(" ");

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        System.out.println("1 -> Toplama");
        System.out.println("2 -> Çıkarma");
        System.out.println("3 -> Bölme");
        System.out.println("4 -> Çarpma");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
                break;
            case 4:
                System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }

    }
}