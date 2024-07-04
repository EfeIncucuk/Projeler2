import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int armut,elma,domates,muz,patlican;
        System.out.print("Kaç kilo armut aldın?");
        armut = input.nextInt();
        System.out.print("elma kaç kilo?");
        elma = input.nextInt();
        System.out.print("domates kaç kilo?");
        domates = input.nextInt();
        System.out.print("muz kaç kilo?");
        muz = input.nextInt();
        System.out.print("patlıcan ka. kilo");
        patlican = input.nextInt();
        
        
        double Total = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00;
        System.out.println("Toplam Tutar: " + Total + "TL");


    }
}
