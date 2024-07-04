import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n1,n2,islem;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlemi seçiniz");
        islem = input.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplama İşlemi Sonucu:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu:" + (n1 * n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bölme İşlemi Sonucu:" + (n1 / n2));
                }
                else{
                    System.out.println("Herhangi bir Sayı Sıfıra Bölünemez");
                }
                break;
        }
    }
}
