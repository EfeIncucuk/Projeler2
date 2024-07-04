import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inp = new Scanner(System.in);

        int number;

        System.out.print("Sayıyı Giriniz: ");
        number = inp.nextInt();

        for(int i = number; i >= 1 ; i--){
            for(int j = 1 ; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
