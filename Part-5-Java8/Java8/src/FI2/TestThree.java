package FI2;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestThree {
    public static void main(String[] args) {
        Predicate<String> p1=ename->ename.length()>=5;
        System.out.println(p1.test("Rahul Gandhi"));
        System.out.println(p1.test("Raj"));
    }
}
