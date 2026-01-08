package FunctionI;

import java.util.function.Function;
public class TestThree {
    public static void main(String[] args) {
        Function<String,Integer> t1= name->name.length();

        System.out.println(t1.apply("Rahul"));
    }
}
