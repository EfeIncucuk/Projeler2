# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int k,toplam = 0;

        do{
            System.out.println("Sayı giriniz:");
            k = input.nextInt();
            if(k % 4 == 0){
                toplam += k;
            }
        }while(k % 2 != 1);
        System.out.println(toplam);
    }
}

```