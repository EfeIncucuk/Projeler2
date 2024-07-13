import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = 1;

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar sayıları :");
        
        for(int i = 0; i < list.length; i++){
            count = 0;
            for(int j = 0; j < list.length; j++){
                if(list[i] == list[j] && i > j){
                    break;
                }
                if(list[i] == list[j]){
                    count++;
                }
            }
            if(count == 0){continue;}
            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
