import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ALLLOne {
    public static void main(String[] args) {
        List<Integer> eids=new ArrayList<Integer>(Arrays.asList(101,102,103,104));
        System.out.println(eids);
        Iterator itr=eids.iterator();
        System.out.println(itr);

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
