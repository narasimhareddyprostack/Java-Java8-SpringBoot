import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListFour {
    public static void main(String[] args) {
        List<String> enames=new LinkedList<String>(Arrays.asList("RG","SG","PG"));
        System.out.println(enames);
        Collections.sort(enames);
        System.out.println(enames);
    }
}
