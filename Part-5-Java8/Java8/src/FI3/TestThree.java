package FI3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestThree {
    public static void main(String[] args) {
        Predicate<List> p1= enames->enames.isEmpty();
        System.out.println(p1.test(Arrays.asList(10,20,30)));
    }
}
