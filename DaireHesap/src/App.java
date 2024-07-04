import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double pi = 3.14;
        double r;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz:");
        r = inp.nextInt();
        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        System.out.println("Dairenin çevresi:" + cevre);
        System.out.println("Dairenin alanı: " + alan);

    }
}
