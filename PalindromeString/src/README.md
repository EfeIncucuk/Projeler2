# Kodlar


```java
import java.util.Scanner;

public class App {
    static boolean isPalindrome(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if(reversed.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = inp.nextLine();
        
        System.out.println(isPalindrome(word));
    }
}
```