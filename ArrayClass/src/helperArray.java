public class helperArray {
    static void toString(int[] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }

    static void fill(int[] arr, int number){
        for(int i = 0; i < arr.length; i++){
            arr[i] = number;
        }
    }

    static void fill(int[] arr, int startIndex, int endIndex, int number){
        for(int i = startIndex; i <= endIndex; i++){
            arr[i] = number;
        }
    }
}
