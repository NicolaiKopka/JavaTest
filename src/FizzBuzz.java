import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {
        //fizzBuzz();
        System.out.println(fib(40));

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
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        if(map.get(n) == null) {
            map.put(n, fib(n-2) + fib(n-1));
        }
        return map.get(n);
    }
}
