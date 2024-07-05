import java.util.Scanner;
public class App {
    
    static int Exponent(int a, int b){
        if(b == 0){
            return 1;
        }
        else{
            return a * Exponent(a, b - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int base = scan.nextInt();

        System.out.print("Üssü Giriniz: ");
        int exp = scan.nextInt();

        System.out.println(Exponent(base, exp));
    }
}
