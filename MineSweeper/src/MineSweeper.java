import java.util.Scanner;
public class MineSweeper {
    int row;
    int col;
    int diff;
    String[][] MainLand;
    String[][] tempLand;
    String[][] winLand;

    Scanner input = new Scanner(System.in);

    public MineSweeper(int row, int col, int diff){
        this.row = row;
        this.col = col;
        this.MainLand = new String[row][col];
        this.tempLand = new String[row][col];
        this.winLand = new String[row][col];
        this.diff = diff;
    }

    public int bombRate(){
        return ((row * col) / (this.diff + 2));
    }

    public void createMainLand(){
        int count = 0;
        while(count != bombRate()){
            count = 0;
            for(int i = 0; i < MainLand.length; i++){
                for(int j = 0; j < MainLand[i].length; j++){
                    if(count < bombRate()){
                        Double random = Math.random() * 100;
                        if(random < 25){
                            this.MainLand[i][j] = "*";
                            count++;
                        }
                        else{
                            this.MainLand[i][j] = "-";
                        }
                    }
                    else{
                        this.MainLand[i][j] = "-";
                    }
                }
            }
        }
    }

    public void createtempLand(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                this.tempLand[i][j] = "-";
            }
        }
    }

    public void printLand(String[][] land){
        for(String[] row : land){
            for(String col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public boolean checkBomb(String land[][], int i, int j){
        if(land[i][j] == "*"){
            return true;
        }
        else{
            return false;
        }
    }

    public int howMuchBomb(String land[][], int i, int j){
        int count = 0;
        if(i > 0 && j > 0 && land[i - 1][j - 1] == "*"){
            count++;
        }
        if(i > 0 && land[i - 1][j] == "*"){
            count++;
        }
        if(i > 0 && j < (col - 1) && land[i - 1][j + 1] == "*"){
            count++;
        }
        if(j > 0 && land[i][j - 1] == "*"){
            count++;
        }
        if(j < (col - 1) && land[i][j + 1] == "*"){
            count++;
        }
        if(i < (row - 1) && j > 0 && land[i + 1][j - 1] == "*"){
            count++;
        }
        if(i < (row - 1) && land[i + 1][j] == "*"){
            count++;
        }
        if( j < (col - 1) && i < (row - 1) && land[i + 1][j + 1] == "*"){
            count++;
        }
        return count;
    }

    public boolean checkWin(String land[][]){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(land[i][j] == "-"){
                    return false;
                }
            }
        }
        return true;
    }

    public void run(){
        createMainLand();
        winLand = MainLand;
        createtempLand();
        boolean isLose = false;

        while(!isLose){
            System.out.println("==========================");
            printLand(tempLand);
            System.out.print("Enter row : ");
            int temprow = input.nextInt() - 1;
            if(temprow < 0 || temprow >= row){
                System.out.println("Invalid Value !!");
                continue;
            }
            System.out.print("Enter column : ");
            int tempcol = input.nextInt() - 1;
            if(tempcol < 0 || tempcol >= col){
                System.out.println("Invalid Value !!");
                continue;
            }

            if(MainLand[temprow][tempcol] != "*"){
                tempLand[temprow][tempcol] = String.valueOf(howMuchBomb(MainLand, temprow, tempcol));
                winLand[temprow][tempcol] = String.valueOf(howMuchBomb(MainLand, temprow, tempcol));
            }
            else if(MainLand[temprow][tempcol] == "*"){
                isLose = true;
                System.out.println("==============");
                System.out.println("GAME OVER");
                System.out.println("===============");
                printLand(MainLand);
            }

            if(checkWin(winLand)){
                System.out.println("==============");
                System.out.println("!!*YOU WİN*!!");
                System.out.println("==================");
                printLand(MainLand);
                break;
            }
        }
        
    }
}
