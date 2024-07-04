# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int a,b;

        System.out.print("İlk Sayıyı Giriniz:");
        a = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        b = inp.nextInt();

        int i = 1;
        int EBOB = 0,EKOK = 0;


        while(i < b || i < a){
            if(b % i == 0 && a % i == 0){
                EBOB = i;
            }
            i++;
        }

        i = 1;

        while(i < a * b){
            if(i % b == 0 && i % a == 0){
                EKOK = i;
                break;
            }
            i++;
        }
        System.out.println("İki sayının ebobu : " + EBOB);
        System.out.println("İki sayının ekoku : " + EKOK);
    }
}
```