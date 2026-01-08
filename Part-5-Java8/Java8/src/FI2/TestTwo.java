package FI2;

interface PredicateOne{
    public  abstract boolean test(String ename);
}
public class TestTwo {
    public static void main(String[] args) {
        PredicateOne p=name->name.length()>=5;
        System.out.println(p.test("Rahul Gandhi"));
        System.out.println(p.test("Raj"));

    }
}
