public class Test {
    public static void main(String[] args) {
        SA sa1=new SA(101,"Rahul","rg@gmail.com",4000);
        sa1.setMin_Bal(500.00);
        sa1.cal_Bal();
        
        CA ca1=new CA(10001,"Sonai","sg@gmail.com",50000);
        ca1.setMin_Bal(5000.5);
        ca1.cal_Bal();
    }
    
}
