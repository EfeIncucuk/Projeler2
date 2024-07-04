# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double kilo,boy;
        System.out.println("Boyunuzu metre (m) cinsinden giriniz:");
        boy = input.nextDouble();
        System.out.println("Kilonuzu kilogram (kg) cinsinden giriniz");
        kilo = input.nextDouble();

        double endeks = kilo / (boy *boy);
        System.out.println("Vücut kitle endeksiniz:" + endeks);
    }
}
```