import java.util.Scanner;
public class App {
    
    static boolean isPolindrom(int Number){
        int temp = Number, lastNumber, reverseNumber = 0;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber  * 10) + lastNumber;
            temp /= 10;
        }
        
        if(reverseNumber == Number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int number;
        
        System.out.print("Sayıyı giriniz:");
        number = inp.nextInt();
        
        System.out.println(isPolindrom(number));
    }
}
