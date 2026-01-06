package lambdaone;
interface FIOne{
    public abstract  int get();
}
public class FIImpl implements  FIOne{
    public int get(){
        return  100;
    }

    public static void main(String[] args) {
        FIOne fi=new FIImpl();
        System.out.println(fi.get());
    }
}
