package FI3;
import java.util.Arrays;
import java.util.List;
interface  PredicateOne{
    public  abstract  boolean test(List enames);
}
public class TestTwo{
    public static void main(String[] args) {
        PredicateOne p1=names->names.isEmpty();
        System.out.println(p1.test(Arrays.asList("RG","G")));
    }
}
