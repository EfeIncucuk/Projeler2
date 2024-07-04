import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        int yil,kalan,yuzkalan,dortyuzkalan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl giriniz:");
        yil = inp.nextInt();

        kalan = yil % 4;
        yuzkalan = yil % 100;
        dortyuzkalan = yil % 400;

        if(kalan == 0){
            if(yuzkalan == 0){
                if(dortyuzkalan == 0){
                    System.out.println(yil + " Artık Yıldır!");
                }
                else{
                    System.out.println(yil + " Artık Yıl Değildir!");
                }
            }
            else{System.out.println(yil + " Artık Yıldır!");}
        }
        else{
            System.out.println(yil + " Artık Yıl Değildir!");
        }
    }
}
