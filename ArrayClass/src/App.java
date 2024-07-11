public class App {
    public static void main(String[] args) throws Exception {
        int list[] = {1,2,3,4,5};
        helperArray.toString(list);
        helperArray.fill(list, 1, 3, 12);
        helperArray.toString(list);
    }
}
