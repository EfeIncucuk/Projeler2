import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz:");
        n = inp.nextInt();

        int count = 0;

        for(int i = 2; i <= n; i++){
            for(int j = 2; j < i; j++){
                count = 0;
                if(i % j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){System.out.print(i + " ");}
        }
    }
}
