import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFour {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        ArrayList<String> al3=new ArrayList<String>();
        ArrayList<Integer> al4=new ArrayList<Integer>(Arrays.asList(10,20,30));
        ArrayList<String> al5=new ArrayList<String>(Arrays.asList("RG","SG","PG"));
        List<Integer> al6=new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);
        System.out.println(al4);
        System.out.println(al5);
        System.out.println(al6);
    }
}
