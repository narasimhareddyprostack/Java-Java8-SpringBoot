import java.util.Collections;
import java.util.LinkedList;

public class ListedListOne {
    public static void main(String[] args) {
       LinkedList ll1=new LinkedList();
        System.out.println(ll1);//[]
        LinkedList<Integer> eids=new LinkedList<Integer>();
        eids.add(105);
        eids.add(102);
        eids.add(101);
        eids.add(104);
        eids.add(103);
        for(Integer eid:eids){
            System.out.println(eid);
        }
        Collections.sort(eids);
        System.out.println(eids);
    }
}
