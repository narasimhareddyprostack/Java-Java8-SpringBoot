abstract class Bank{
    //zero or more abstract methods
}
class Account{
}
public class TestTwo {
    public static void main(String[] args) {
        new Bank();
        //we cant create objects for abstract classes
        new Account();
        
    }
}
