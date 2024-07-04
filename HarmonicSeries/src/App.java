import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int n;

        System.out.println("Serinin n'inci sayısını giriniz:");
        n = inp.nextInt();

        double total = 0;

        for(double i = 1; i <= n; i++){
            total += 1/i;
        }
        System.out.println(total);
    }
}
