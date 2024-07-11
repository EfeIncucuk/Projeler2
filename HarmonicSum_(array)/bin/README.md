# Kodlar


```java
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inp = new Scanner(System.in);
       
        System.out.print("Kaç elemanlı dizi olsun: ");
        int a = inp.nextInt();
        
        double array[] = new double[a];

        for(int i = 0; i < array.length; i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            array[i] = inp.nextInt();
        }

        System.out.println("===============");
        System.out.println(Arrays.toString(array));
        System.out.println("===============");

        double sum = 0;
        
        for(int i  = 0; i < array.length; i++){
            sum += (1/array[i]);
            System.out.println(sum);
        }

        System.out.println("===============");
        System.out.println(array.length / sum);
    }
}
```