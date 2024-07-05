# Kodlar

```java
import java.util.Scanner;
public class App {
    
    static boolean Asal(int number, int i){
        if(number < 2){
            return false;
        }
        else if(i == 1){
            return true;
        }
        else if(number % i == 0){
            return false;
        }
        return Asal(number, i - 1);
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        boolean result = Asal(number, number - 1);

        if(result == true){
            System.out.println(number + " bir asal sayıdır.");
        }
        else{
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
```