# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int number;

        System.out.print("Sayıyı giriniz:");
        number = inp.nextInt();
        int count = 0;

        for(int i = number; i >= 1; i /= 10){
            count++;
        }
        
        int total = 0;
        int tempnumber;
        int temppow;

        for(int i = number; i >= 1; i /= 10){
            tempnumber = i % 10;
            temppow = 1;
            for(int k = 1; k <= count; k++){
                temppow *= tempnumber;
            }
            total += temppow;
        }
        if(total == number){
            System.out.println(number + " Bir Armstrong Sayısıdır!");
        }
        else{
            System.out.println(number + " Bir Armstrong Sayısı değildir!!");
        }
    }
}

```