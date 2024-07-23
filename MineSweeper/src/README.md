# Kodlar


## App

```java
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

```

## MineSweeper

```java
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

    public void openZero(String land[][], int i, int j){
        if(i > 0 && j > 0){
            this.tempLand[i - 1][j - 1] = String.valueOf(howMuchBomb(land, i - 1, j - 1));
            this.winLand[i - 1][j - 1] = String.valueOf(howMuchBomb(land, i - 1, j - 1));
        }
        if(i > 0){
            this.tempLand[i - 1][j] = String.valueOf(howMuchBomb(land, i - 1, j));
            this.winLand[i - 1][j] = String.valueOf(howMuchBomb(land, i - 1, j));
        }
        if(i > 0 && j < (col - 1)){
            this.tempLand[i - 1][j + 1] = String.valueOf(howMuchBomb(land, i - 1, j + 1));
            this.winLand[i - 1][j + 1] = String.valueOf(howMuchBomb(land, i - 1, j + 1));
        }
        if(j > 0){
            this.tempLand[i][j - 1] = String.valueOf(howMuchBomb(land, i, j - 1));
            this.winLand[i][j - 1] = String.valueOf(howMuchBomb(land, i, j - 1));
        }
        if(j < (col - 1)){
            this.tempLand[i][j + 1] = String.valueOf(howMuchBomb(land, i, j + 1));
            this.winLand[i][j + 1] = String.valueOf(howMuchBomb(land, i, j + 1));
        }
        if(i < (row - 1) && j > 0){
            this.tempLand[i + 1][j - 1] = String.valueOf(howMuchBomb(land, i + 1, j - 1));
            this.winLand[i + 1][j - 1] = String.valueOf(howMuchBomb(land, i + 1, j - 1));
        }
        if(i < (row - 1)){
            this.tempLand[i + 1][j] = String.valueOf(howMuchBomb(land, i + 1, j));
            this.winLand[i + 1][j] = String.valueOf(howMuchBomb(land, i + 1, j));
        }
        if( j < (col - 1) && i < (row - 1)){
            this.tempLand[i + 1][j + 1] = String.valueOf(howMuchBomb(land, i + 1, j + 1));
            this.winLand[i + 1][j + 1] = String.valueOf(howMuchBomb(land, i + 1, j + 1));
        }
    }

    public boolean checkZero(String land[][], int i, int j){
        if(i > 0 && j > 0 && land[i - 1][j - 1] == "0"){
            return true;
        }
        if(i > 0 && land[i - 1][j] == "0"){
            return true;
        }
        if(i > 0 && j < (col - 1) && land[i - 1][j + 1] == "0"){
            return true;
        }
        if(j > 0 && land[i][j - 1] == "0"){
            return true;
        }
        if(j < (col - 1) && land[i][j + 1] == "0"){
            return true;
        }
        if(i < (row - 1) && j > 0 && land[i + 1][j - 1] == "0"){
            return true;
        }
        if(i < (row - 1) && land[i + 1][j] == "0"){
            return true;
        }
        if( j < (col - 1) && i < (row - 1) && land[i + 1][j + 1] == "0"){
            return true;
        }
        return false;
    }

    public void checkAllZero(){
        for(int i = 0; i < MainLand.length; i++){
            for(int j = 0; j < MainLand[i].length; j++){
                if(tempLand[i][j].equals("0")){
                    openZero(MainLand, i, j);
                    if(checkZero(tempLand, i, j) == true){
                        checkAllZero();
                    }
                }
            }
        }
        for(int i = MainLand.length - 1; i >= 0; i = i-1){
            for(int j = MainLand.length - 1; j >= 0; j = j-1){
                if(tempLand[i][j].equals("0")){
                    openZero(MainLand, i, j);
                    if(checkZero(tempLand, i, j) == true){
                        checkAllZero();
                    }
                }
            }
        }
    }

    public boolean checkFlagInput(int input){
        while(input < 1 || input > 2){
            System.out.println("wrong input!!");
            System.out.println("Try again");
        }

        if(input == 1){
            return true;
        }

        if(input == 2){
            return false;
        }
        else{
            return false;
        }
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
        System.out.println("==========================");
        System.out.println("There is " + bombRate() + " bombs consists");

        while(!isLose){
            System.out.println("==========================");
            printLand(tempLand);

            System.out.println("Put flag ? \n1 : true \n2 : false");
            int flagInput = input.nextInt();
            if(flagInput < 1 || flagInput > 2){
                System.out.println("Invalid value !!");
                continue;
            }

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

            if(checkFlagInput(flagInput) == true){
                if(tempLand[temprow][tempcol] == "-"){
                    tempLand[temprow][tempcol] = "|";
                    continue;
                }
                else{
                    System.out.println("You cannot put flag here !!");
                }
                
            }

            if(MainLand[temprow][tempcol] != "*"){
                tempLand[temprow][tempcol] = String.valueOf(howMuchBomb(MainLand, temprow, tempcol));
                winLand[temprow][tempcol] = String.valueOf(howMuchBomb(MainLand, temprow, tempcol));
                if(howMuchBomb(MainLand, temprow, tempcol) == 0){
                    openZero(MainLand,temprow,tempcol);
                    checkAllZero();
                }
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
```