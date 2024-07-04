import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int n;

        System.out.println("Bir sayı giriniz:");
        n = inp.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i > 0; i--){
            for(int j = 1; j <= n - i;j++){
                System.out.print(" ");
            }
            for(int k = i * 2 - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
