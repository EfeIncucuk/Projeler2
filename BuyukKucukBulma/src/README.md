# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1,n2,kac,buyuksayi = 0,kucuksayi = 0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Kaç tane Sayı Gireceksiniz?(en az 2 tane) ");
            kac = inp.nextInt();
            if(kac < 2){System.out.println("Hatalı Giriş!!!");}
        }while(kac < 2);

        System.out.print("1. Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        
        buyuksayi = n1;
        kucuksayi = n1;

        for(int i = 2; i <= kac; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            n2 = inp.nextInt();
            if(n2 > n1 && n2 > buyuksayi){
                buyuksayi = n2;
            }
            if(n2 < n1 && n2 < kucuksayi){
                kucuksayi = n2;
            }
        }
        System.out.println("En büyük sayı: " + buyuksayi);
        System.out.println("En küçük sayı: " + kucuksayi);
    }
}

```