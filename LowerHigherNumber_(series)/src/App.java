import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner inp = new Scanner(System.in);

        int[] list = {54, -32, 128, -74, 5, 15, 65, 1426, -8};

        int min = list[0];
        int max = list[0];

        for(int i : list){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }

        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();

        int lower = min;
        int higher = max;

        for(int i : list){
            if(i > lower && i < number){
                lower = i;
            }

            if(i < higher && i > number){
                higher = i;
            }

            if(number <= min){
                lower = number;
            }
            
            if(number >= max){
                higher = number;
            }
        }
        if(lower == number){
            System.out.println("Girilen sayıdan küçük bir değer yoktur");
        }
        else{
            System.out.println("Girilen sayıdan küçük en büyük sayı: " + lower);
        }
        
        if(higher == number){
            System.out.println("Girilen sayıdan büyük bir değer yoktur");
        }
        else{
            System.out.println("Girilen sayıdan büyük en küçük sayı: " + higher);
        }
        
    }
}
