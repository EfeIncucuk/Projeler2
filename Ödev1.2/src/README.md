# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        n = inp.nextInt();

        for(int i = 1; i <= n; i*=4){
            System.out.println(i);
        }
        for(int k = 1; k <= n; k*=5){
            if(k != 1){System.out.println(k);};
        }
    }
}
```