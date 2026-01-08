package FunctionI;
@FunctionalInterface
interface FunctoinI{
    public abstract int apply(String ename);
}
public class TestOne implements FunctoinI{
    public  int apply(String ename){
        return  ename.length();
    }
    public static void main(String[] args) {
        FunctoinI t1=new TestOne();
        System.out.println(t1.apply("Rahul"));
    }
}
