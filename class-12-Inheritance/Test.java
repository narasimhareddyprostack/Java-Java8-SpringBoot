public class Test {
    public static void main(String[] args) {
       Parent p1=new Parent();
       p1.m1();
       p1.m2();
       
       System.out.println("_________________________________");
       Child c1=new Child();
       c1.m1();
       c1.m2();
       c1.m3();
       System.out.println("_________________________________");
       Parent c2=new Child();
       c2.m1();
       c2.m2();
       System.out.println("_________________________________");
       Child p2=new Parent();
       //Note: Child Type cann't hold Parent Object
    }
}
