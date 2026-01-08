package FunctionI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
interface Function2{
    public  abstract int apply(List enames);
}
public class TestFour {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RG","SG","PG");
        Function<List,Integer> f1= names->names.size();

        Function2 f2= names->names.size();

        System.out.println(f1.apply(enames));
        System.out.println(f2.apply(enames));

    }
}
