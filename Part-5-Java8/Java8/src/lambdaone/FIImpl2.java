package lambdaone;

interface FITwo{
    public  abstract int get();
}
public class FIImpl2 {


    public static void main(String[] args) {
        FITwo fi=()->100;
        System.out.println(fi.get());
    }
}
