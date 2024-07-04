# Kodlar

```java
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String userName,password,soru,yenisifre;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = inp.nextLine();

        System.out.println("Şifrenizi Giriniz:");
        password = inp.nextLine();

        if(userName.equals("Efe") && password.equals("Efe123")){
            System.out.println("Giriş Yaptınız!");
        }
        else{
            System.out.println("Yanlış Giriş Yaptınız!");
            System.out.println("Şifrenizi değişirmek İster misiniz?");
            soru = inp.nextLine();
            if(soru.equals("Evet")){
                System.out.println("Yeni şifrenizi Giriniz:");
                yenisifre = inp.nextLine();
                if(yenisifre.equals("Efe123")){
                    System.out.println("Yeni Şifreniz Eski Şifrenizle aynı olamaz!!");
                }
                else{
                    password = yenisifre;
                    System.out.println("Şifrenizi Değiştirdiniz!");
                }
            }
            else if(soru.equals("Hayir")){
                System.out.println("Siz Bilirsiniz");
            }
            else{
                System.out.println("Hatalı girdi Yaptınız!");
                System.out.println("Kelime Başı Büyük Harf Kullanımına Dikkat edelim!");
                System.out.println("Türkçe Karakter Kullanmayınız!!");
            }
        }
    }
}

```