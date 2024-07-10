# Kodlar

```java
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int matris[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        int number = 0;

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[0].length; j++){
                System.out.print("Matirisin " + (i+1) + ". satırı " + (j+1) + ". sütünun değerini giriniz: ");
                number = input.nextInt();
                matris[i][j] = number;
            }
        }

        for(int i = 0; i < matris.length; i++){
            System.out.println();
            for(int j = 0; j < matris[0].length; j++){
                System.out.print(matris[i][j] + " ");
            }
        }
    }
}
```