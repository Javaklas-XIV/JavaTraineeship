public class Greatest {

    public static void main(String[] args) {
        System.out.println(greatest(1, 2));
        System.out.println(greatest("string", "longer string"));
        System.out.println(factorial(5));
    }

    public static int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public static String greatest(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static int factorial(int number) {
        if (number <= 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
