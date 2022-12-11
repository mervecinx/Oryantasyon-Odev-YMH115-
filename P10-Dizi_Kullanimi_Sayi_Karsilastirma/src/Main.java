import java.util.*;
public class Main {

    public static void alan(double yaricap) {
        //Alan=PI*r*r

        System.out.println("Alan = " + (Math.PI * yaricap * yaricap));

    }

    public static void cevre(double yaricap) {
        //Alan=PI*r*2

        System.out.println("Çevre = " + (Math.PI * yaricap * 2));

    }

    public static void main(String[] args) {

        //Metot kullanarak yarıçapı girilen bir dairenin alanını ve çevresini hesaplama
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        double yaricap = input.nextDouble();
        System.out.println(" ");

        cevre(yaricap);
        alan(yaricap);


    }
}