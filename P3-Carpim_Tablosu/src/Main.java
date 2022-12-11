import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Girilen sayının çarpım tablosunu bulma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
        }

    }
}