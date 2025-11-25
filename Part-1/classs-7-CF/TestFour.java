public class TestFour {
    public static void main(String[] args) {
        String[] enames={"Rahul","Sonia","Priyanka"};
        System.out.println(enames.length); //3
        
        String ename="Rahul Gandhi";
        if(ename.length()>=4){
            System.out.println("Valid User Name");
        }
        else{
            System.out.println("String length is less than 4");
        }
    }
}
