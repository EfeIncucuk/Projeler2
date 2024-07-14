import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("How many rows consists (max:10) : ");
        int row = inp.nextInt();
        while(row < 1 || row > 10){
            System.out.print("Invalid Value!! Try again : ");
            row = inp.nextInt();
        }

        System.out.print("How many columns consists (max:10) : ");
        int col = inp.nextInt();
        while(col < 1 || col > 10){
            System.out.print("Invalid Value!! Try again : ");
            col = inp.nextInt();
        }

        System.out.print("Difficulty : \nEasy : 3\nNormal : 2\nHard : 1\nSelect : ");
        int diff = inp.nextInt();
        while(diff < 1 || diff > 3){
            System.out.print("Invalid Value!! Try again : ");
            diff = inp.nextInt();
        }
        
        
        MineSweeper mine = new MineSweeper(row, col, diff);
        mine.run();
    }
}
