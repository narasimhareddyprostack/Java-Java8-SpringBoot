import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListThree {
    public static void main(String[] args) {
      LinkedList<String> enames=new LinkedList<String>(Arrays.asList("RG","SG","PG",null,null));
      System.out.println(enames);
      enames.addFirst("NM");
      enames.addLast("Amith Shaw");
      System.out.println(enames);
      enames.removeFirst();
      System.out.println(enames);
    }
}
