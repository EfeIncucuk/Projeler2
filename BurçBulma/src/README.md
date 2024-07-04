# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int month,day;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz:");
        month = inp.nextInt();

        System.out.println("Kaçını gününde doğdunuz:");
        day = inp.nextInt();

        switch(month){
            case 1:
                if(day < 21 && day >= 1){
                    System.out.println("Oğlak Burcusunuz");
                }
                else if(day >= 21 && day <=31){
                    System.out.println("Kova Burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 2:
                if(day <= 20 && day >= 1){
                    System.out.println("Kova burcusunuz");
                }
                else if(day >=21 && day <= 28){
                    System.out.println("Balık burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 3:
                if(day <= 20 && day >= 1){
                    System.out.println("Balık burcusunuz");
                }
                else if(day >= 20 && day <= 31){
                    System.out.println("Koç Burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 4:
                if(day <= 20 && day >= 1){
                    System.out.println("Koç burcusunuz");
                }
                else if(day >=21 && day <=30){
                    System.out.println("Boğa Burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 5:
                if(day <=21 && day >= 1){
                    System.out.println("Boğa burcusunuz");
                }
                else if(day >=22 && day <=31){
                    System.out.println("İkizler burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 6:
                if(day <= 22 && day >= 1){
                    System.out.println("İkizler Burcusunuz");
                }
                else if(day >=23 && day <=30){
                    System.out.println("Yengeç burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 7:
                if(day <= 23 && day >= 1){
                    System.out.println("Yengeç Burcusunuz");
                }
                else if(day >=24 && day <=31){
                    System.out.println("Aslan burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 8:
                if(day <= 23 && day >= 1){
                    System.out.println("Aslan Burcusunuz");
                }
                else if(day >=24 && day <=31){
                    System.out.println("Başak burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 9:
                if(day <= 22 && day >= 1){
                    System.out.println("Başak Burcusunuz");
                }
                else if(day >=23 && day <=30){
                    System.out.println("Terazi burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 10:
                if(day <= 22 && day >= 1){
                    System.out.println("Terazi Burcusunuz");
                }
                else if(day >=23 && day <=31){
                    System.out.println("Akrep burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 11:
                if(day <= 21 && day >= 1){
                    System.out.println("Akrep Burcusunuz");
                }
                else if(day >=22 && day <=30){
                    System.out.println("Yay burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            case 12:
                if(day <= 21 && day >= 1){
                    System.out.println("Yay Burcusunuz");
                }
                else if(day >=22 && day <=31){
                    System.out.println("Oğlak burcusunuz");
                }
                else{
                    System.out.println("Hatalı gün girişi");
                }
                break;
            default:
                System.out.println("Geçersiz Ay Girişi");
        }
    }
}

```