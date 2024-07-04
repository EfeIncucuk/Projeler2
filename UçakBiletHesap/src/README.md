# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int km,age,type;
        double amount,disrate = 1,disamount,total,total2,distype;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz:");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz:");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 -> Tek yön -- 2 -> çift yön):");
        type = inp.nextInt();

        if(km <= 0 || age <= 0 || (type != 1 && type != 2)){
            System.out.println("Hatalı bilgi girdiniz!!!");
        }
        else{
            amount = 0.1 * km;
            if(age <= 12){
                disrate = 0.5;
            }
            else if(age > 12 && age < 24){
                disrate = 0.1;
            }
            else if(age >= 65){
                disrate = 0.3;
            }
            else{
                disrate = 0;
            }
            disamount = amount * disrate;
            total = amount - disamount;
            distype = total * 0.2;
            total2 = (total- distype) * 2;
    
            if(type == 1){
                System.out.println("Toplam Tutar:" + total + "TL");
            }
            else if(type == 2){
                System.out.println("toplam tutar:" + total2 + "TL");
            }
        }
    }
}

```