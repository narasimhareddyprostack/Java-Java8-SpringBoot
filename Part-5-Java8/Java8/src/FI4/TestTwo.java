package FI4;

import java.util.Arrays;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RG","SG","PG");
        ConsumerOne c1=names->{
            for (Object name:names) {
                System.out.println(name);
            }
        };
        c1.accept(enames);
    }
}
