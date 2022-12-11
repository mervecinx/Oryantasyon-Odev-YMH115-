import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] sayi = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("10 adet tamsayı girin: ");
        int ciftSayi, tekSayi, enBuyuk = 0, enKucuk = 0;

        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = input.nextInt();
        }

        for (int k = 0; k < sayi.length; k++) {

            if (sayi[k] % 2 == 0) {
                ciftSayi = sayi[k];
                if (enKucuk > ciftSayi) {
                    enKucuk = ciftSayi;
                }
            }

            if (sayi[k] % 2 != 0) {
                tekSayi = sayi[k];
                if (enBuyuk < tekSayi) {
                    enBuyuk = tekSayi;
                }

            }

        }

        System.out.println("En büyük tek sayı: " + enBuyuk);
        System.out.println("En küçük çift sayi: " + enKucuk);

    }
}