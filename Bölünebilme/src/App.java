import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double k,Total = 0,sayac = 0,ortalama;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Sayı Giriniz:");
        k = inp.nextInt();

        for(int i = 1; i <= k; i++){
            if(i % 3 == 0 || i % 4 == 0){
                Total += i;
                sayac += 1;
            }
        }
        ortalama = Total / sayac;
        System.out.println(ortalama);
    }
}
