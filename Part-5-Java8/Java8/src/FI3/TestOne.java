package FI3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface PredicateTwo{
    public  abstract boolean test(List enames);
}
public class TestOne implements PredicateTwo {
    public boolean test(List enames){
       return enames.isEmpty();
    }

    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RG","SG","PG");
        PredicateTwo t1=new TestOne();
        System.out.println(t1.test(enames));
    }
}
