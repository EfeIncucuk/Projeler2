import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int Number;

        System.out.println("Eleman Sayısını Giriniz: ");
        Number = inp.nextInt();

        int n1,n2;

        n1 = 0;
        n2 = 1;
        int n3;

        for(int i = 1; i <= Number; i++){
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }
}
