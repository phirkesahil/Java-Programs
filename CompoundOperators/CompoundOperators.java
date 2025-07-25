public class CompoundOperators {
    public static void main(String[] args) {
        int a = 10;

        a += 5;  // a = a + 5
        System.out.println("After adding 5, value of a: " + a);

        a -= 3;  // a = a - 3
        System.out.println("After subtracting 3, value of a: " + a);

        a *= 2;  // a = a * 2
        System.out.println("After multiplying by 2, value of a: " + a);

        a /= 4;  // a = a / 4
        System.out.println("After dividing by 4, value of a: " + a);

        a %= 4;  // a = a % 4
        System.out.println("Remainder when divided by 4, value of a: " + a);
    }
}