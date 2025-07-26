public class PrePostIncrement {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x;

        int a = 5;
        int b = a++;

        System.out.println("Pre-increment result: " + y);
        System.out.println("Post-increment result: " + b);
    }
}
