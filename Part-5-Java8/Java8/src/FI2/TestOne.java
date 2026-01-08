package FI2;
interface PredicateTwo{
    public  abstract boolean test(String ename);
}
public class TestOne implements  PredicateTwo{
    public boolean test(String ename){
        return  ename.length()>=5;
    }
    public static void main(String[] args) {
        PredicateTwo p1=new TestOne();
        System.out.println(p1.test("Rahul Gandhi"));
        System.out.println(p1.test("Maha"));
    }
}
