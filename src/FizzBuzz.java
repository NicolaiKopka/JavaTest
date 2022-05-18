import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {
        //fizzBuzz();
        //System.out.println(fib(40));
        //int var1 = 5;
        //int var2 = 2;
        //System.out.println(var1 + var2 + "Summe");

        //String result = var1 > var2 ? "Stimmt" : "Stimmt nicht";
        //System.out.println(result);
        System.out.println(classicRec(8));

    }

    public static void fizzBuzz() {
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int fib(int n) {
        Map<Integer, Integer> map= new HashMap<>(Map.of(0, 0, 1, 1));
        if(map.get(n) == null) {
            map.put(n, fib(n-2) + fib(n-1));
        }
        return map.get(n);
    }

//    public static int fib2(int n) {
//        int last = 0;
//        int next = 1;
//        for (int i = 0; i < n; i++) {
//            int oldLast = last;
//            last = next;
//            next = next + oldLast;
//        }
//        return last;
//    }

    public static int classicRec(int n) {
        if(n < 2) {
            return n;
        }
        return classicRec(n - 2) + classicRec(n - 1);
    }
}
