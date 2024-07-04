# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double matematik,fizik,türkçe,kimya,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        matematik = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        türkçe = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.println("müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        double Toplam = 0;

        if(matematik <= 100 && matematik >= 0){Toplam += matematik;}
        if(fizik <= 100 && fizik >= 0){Toplam += fizik;}
        if(türkçe <= 100 && türkçe >= 0){Toplam += türkçe;}
        if(kimya <= 100 && kimya >= 0){Toplam += kimya;}
        if(muzik <= 100 && muzik >= 0){Toplam += muzik;}

        double average = Toplam / 5;
        
        if(average <= 55){
            System.out.println("Sınıfta Kaldınız.");
        }
        else{
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:" + average);
    }
}
```