public class Demo {
    public static void main(String[] args) {
       Order obj=new Order();
        //System.out.println(obj.order_Name);
        obj.set_OrderName("10 Products");
        //System.out.println(obj.order_Name);
        System.out.println(obj.get_OrderName());
    }
}
