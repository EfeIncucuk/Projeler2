import java.util.Scanner;
public class App {
    
    static int[][] transpozedMatrix(int[][] matris){
        int[][] transpozed = new int[matris[0].length][matris.length];
        
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                transpozed[j][i] = matris[i][j];
            }
        }
        
        return transpozed;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner inp = new Scanner(System.in);

        int row = 0;
        int col = 0;

        System.out.print("Matris kaç satırlı ? (max:4) : ");
        while(row <= 0 || row > 4){
            row = inp.nextInt();
            if(row <= 0 || row > 4){
                System.out.println(" Geçersiz bir değer girdiniz");
                System.out.print("Tekrar giriniz : ");
            }
        }

        System.out.print("Matris kaç sütunlu ? (max:4) : ");
        while(col <= 0 || col > 4){
            col = inp.nextInt();
            if(col <= 0 || col > 4){
                System.out.println("Geçersiz bir değer girdiniz");
                System.out.print("Tekrar giriniz : ");
            }
        }

        int[][] matris = new int[row][col];

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.print("Matrisin " + (i+1) + ". satırı " + (j+1) + ". sütunun değerini giriniz : ");
                matris[i][j] = inp.nextInt();
            }
        }

        System.out.println("Matris : ");

        for(int[] i : matris){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println(" Tranpozed matrix : ");

        for(int[] i : transpozedMatrix(matris)){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
