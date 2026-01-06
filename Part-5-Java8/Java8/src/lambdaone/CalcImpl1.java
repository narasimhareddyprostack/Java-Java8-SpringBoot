package lambdaone;
@FunctionalInterface
interface  CalcI{
    public  abstract int add(int a,int b);
    //public abstract sub(int a,int b);
}
public class CalcImpl1 implements CalcI {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        CalcI ci=new CalcImpl1();
        System.out.println(ci.add(10,20));
    }
}
