import java.util.ArrayList;
import java.util.List;

public class ArrayListOne {
    public static void main(String[] args) {
       List<String> enames=new ArrayList<String>();
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       System.out.println(enames);
//       int i=0;
//       while(i<=enames.size()-1){
//           System.out.println(enames.get(i));
//           i++;
//       }
        for(String ename:enames){
            System.out.println(ename);
        }
    }
}
