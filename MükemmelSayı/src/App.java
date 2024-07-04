import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int number,total = 0;

        System.out.print("Sayıyı Giriniz: ");
        number = inp.nextInt();

        for(int i = 1; i < number; i++){
            if(number % i == 0){total += i;}
        }
        if(number == total){System.out.println(number + " Mükemmel Sayıdır.");}
        else{System.out.println(number + " Mükemmel Sayı Değildir");}
    }
}
