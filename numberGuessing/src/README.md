# Kodlar



```java
import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    static int[] sortedArray(int list[]){
        int tempValue;
        
        for(int i = 0; i < list.length; i++){
            for(int j = i; j < list.length; j++){
                if(list[i] > list[j]){
                    tempValue = list[i];
                    list[i] = list[j];
                    list[j] = tempValue;
                }
            }
        }

        return list;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dizinin Boyutu n : ");
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        for(int i = 0; i < list.length; i++){
            System.out.print((i+1) + ". elemanı : ");
            list[i] = input.nextInt();
        }

        sortedArray(list);

        System.out.println("Sıralama : " + Arrays.toString(list));

    }
}
```