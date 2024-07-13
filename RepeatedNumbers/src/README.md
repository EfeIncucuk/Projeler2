# Kodlar


```java
import java.util.Arrays;

public class App {
    
    static boolean isHas(int list[], int number){
        for(int i : list){
            if(number == i){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) throws Exception {
        int[] list = { 3, 5, 7, 48, 3, 2, 2, 12, 15, 12, 42, 7, 42};
        int[] duplicate = new int[list.length];
        int TempIndex = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(i != j && list[i] == list[j]){
                    if(!isHas(duplicate, list[i])){
                        duplicate[TempIndex] = list[i];
                        TempIndex++;
                    }
                    break;
                }
            }
        }

        for(int i : duplicate){
            if(i != 0 && i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
```