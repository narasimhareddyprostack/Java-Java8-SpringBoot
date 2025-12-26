import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTwo {
    public static void main(String[] args) {
       List<String> enames=new ArrayList<String>();
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       System.out.println(enames);
       Iterator itr=enames.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
