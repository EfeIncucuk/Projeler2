import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        boolean iswin = false;
        boolean iswrong = false;

        System.out.println(number);

        while(right < 5){
            System.out.print("Sayıyı Giriniz : ");
            selected = input.nextInt();
            if(selected < 0 || selected > 100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı tahmin ediniz!!");
                if(iswrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hakkınız : " + (5 - right));
                }
                else{
                    iswrong = true;
                    System.out.println("Bir daha hatalı giriş yaparsanız hakkınızdan düşecektir!");
                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler doğru tahmin ettiniz");
                iswin = true;
                break;
            }
            else{
                right++;
                System.out.println("Tahmininiz yanlış !");
                if(selected < number){
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür");
                }
                else{
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür");
                }

                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }

        if(!iswin){
            System.out.println("Kaybettiniz!!!");
        }
    }
}
