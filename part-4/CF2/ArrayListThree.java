import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListThree {
    public static void main(String[] args) {
       List<String> enames=new ArrayList<String>();
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       enames.add("Kalai");
       enames.add("Guru");
       enames.add("Charan");
       enames.add("KP");
       enames.add("Jeffrey");
       System.out.println(enames);
       Collections.sort(enames,Collections.reverseOrder());
       System.out.println(enames);

    }
}
