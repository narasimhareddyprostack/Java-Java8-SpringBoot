interface User{
    abstract void login();
    public  void logout();
}
class UserImpl implements User{
    public void login(){
        System.out.println("Login Success");
    }
    public void logout(){
        System.out.println("Logout successfully");
    }
}
class Test{
    public static void main(String[] args) {
       User u1=new UserImpl();
       u1.login();
       u1.logout();
    }
}