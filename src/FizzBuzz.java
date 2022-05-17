import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {
        //fizzBuzz();
        fib(3);
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

    public static void fib(int n) {
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.get(n);
    }
}
