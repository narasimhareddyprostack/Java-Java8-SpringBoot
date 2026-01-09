package FI4;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ConsumerOne{
    public abstract void accept(List enames);
}
public class TestOne implements  ConsumerOne{
    public void accept(List enames){
        for (Object ename:enames) {
            System.out.println(ename);
        }
    }
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("RG","SG","PG");
        ConsumerOne c1=new TestOne();
        c1.accept(enames);
    }
}
