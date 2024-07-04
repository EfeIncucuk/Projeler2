import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //değişkenler
        double km;

        //Scanner tanımı
        Scanner input = new Scanner(System.in);

        //Bilgi alma
        System.out.println("Gidilen mesafe:");
        km = input.nextDouble();

        //Hesap yapma
        double Tutar = (km * 2.20) + 10;
        Tutar = (Tutar < 20) ? 20 : Tutar;
        //Çıktı Verme
        System.out.println("Ücret: " + Tutar + "TL");


    }
}
