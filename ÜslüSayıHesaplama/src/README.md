# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n,k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz(n):");
        n = inp.nextInt();

        System.out.print("Üssü Giriniz(k):");
        k = inp.nextInt();
        
        
        int total = 1;

        for(int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(total);
    }
}

```