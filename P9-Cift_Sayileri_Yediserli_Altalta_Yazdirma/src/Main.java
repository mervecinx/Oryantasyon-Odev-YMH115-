public class Main {
    public static void main(String[] args) {

        // 1'den 50' ye kadar (50 dahil) olan çift sayıları yedişerli olarak alt alta ekrana yazdıran program

        int sonDeger = 50, sayac = 0;

        for (int i = 1; i < sonDeger; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " , ");
                sayac++;

                if (sayac % 7 == 0) {
                    System.out.println(" ");
                }


            }


        }


    }
}