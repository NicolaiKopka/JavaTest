public class Operators {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.printf("Summe: %d", add(2,3));
        System.out.println();
        checkString("Hallo fancypants also geh ich");

    }

    private static int add(int a, int b) {
        check(a, b);
        return a + b;
    }

    private static void check(int a, int b) {
        if(a > 100 || b > 100) {
            System.out.println("Eine Variable ist groesser als 100");
        }
    }

    private static void checkString(String word) {
        System.out.println("Das Wort hat mehr als 20 Zeichen: " + (word.length() > 20));
        System.out.println("Das Wort enthaelt 'fancy': " + (word.contains("fancy")));
    }
}
