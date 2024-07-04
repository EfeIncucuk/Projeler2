import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n,r;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kümenin eleman sayısını giriniz(n):");
        n = inp.nextInt();

        System.out.println("Altküme eleman sayısını giriniz(r):");
        r = inp.nextInt();

        int nfactorial = 1,rfactorial = 1,ndiffrfactorial = 1;

        for(int i = 1; i <= n; i++){
            nfactorial = i * nfactorial;
        }
        
        for(int i = 1; i <= r; i++){
            rfactorial *= i;
        }

        for(int i = 1; i <= (n-r); i++){
            ndiffrfactorial *= i;
        }

        int comb = nfactorial / (rfactorial * ndiffrfactorial);
        System.out.println(comb);
    }
}
