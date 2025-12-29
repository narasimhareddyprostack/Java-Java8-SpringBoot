import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListFive {
    public static void main(String[] args) {
        List<Integer> eids=new LinkedList<Integer>(Arrays.asList(101,102,103,104));
        //iterate using for loop
        //iterate using while and do..while loop
        //iterate using for-each
        //iterate using iterator() method
        Iterator itr=eids.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
