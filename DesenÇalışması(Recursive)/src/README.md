# Kodlar

```java
import java.util.Scanner;
public class App {
    
    static int desen(int number,int primeNumber, int count){
        if(count > 0){
            System.out.print(number + " ");
            return (desen(number - 5, primeNumber, count -= 1));
        }
        else if(number == primeNumber){
            return number;
        }
        else{
            System.out.print(number + " ");
            return desen(number + 5, primeNumber, count);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();
        int count;
        if(number % 5 == 0){
            count = number / 5;
        }
        else{
            count = (number / 5) + 1;
        }
        System.out.println(desen(number, number, count));
    }
}
```