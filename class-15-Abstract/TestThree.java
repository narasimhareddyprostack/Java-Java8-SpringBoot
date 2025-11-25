abstract class Bank{
    public abstract double cal_Interest();
    //only declaration - means abstract methods
    //if class contains atleast one abstract method
    //class should be declare as abstract
}
public class TestThree {
    public static void main(String[] args) {
        new Bank();//we cant create object
    }
}
