public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("a + b = " + add(a:1, int b:2));
        System.out.println("a + b + c = " + add(a:3, b:4, c:5));
    }
}