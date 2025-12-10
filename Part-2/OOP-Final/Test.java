public class Test {
    public static void main(String[] args) {
        SA sa1=new SA(101, "Rahul", "rg@gmail.com", 5000.00);
        
        
        CA ca1=new CA(1001, "Sonia", "sg@gmail.com", 50000.00);
        
        System.out.println(AccountService.getService(sa1));
        System.out.println(AccountService.getService(ca1));
        
        

    }
}
