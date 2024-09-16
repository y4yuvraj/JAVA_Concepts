package java8.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class All {
    public static void main(String[] args) {

        //function
        Function<String, Integer> f = (a) -> a.length();
        System.out.println(f.apply("Yuvraj"));

        //predicate
        Predicate<Integer> p = x -> x % 2 == 0;
        System.out.println(p.test(20));

        //consumer
        Consumer<String> c=x-> System.out.println(x);
        c.accept("Hello");

        //supplier
        Supplier<Integer> s=()->Integer.valueOf("123");
        System.out.println(s.get());

    }
}