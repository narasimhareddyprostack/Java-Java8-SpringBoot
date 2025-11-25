class Parent{
    public void m1(){
        System.out.println("Parent Class - m1 method");
    }
    public void m2(){
        System.out.println("Parent Class - m2 method");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("Child Class - m1 overriding method");
    }
    public void m3(){
        System.out.println("Child Class - m3 method");
    }

}
class Test{
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.m1();
        p1.m2();
        System.out.println("*****************");
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
         System.out.println("*****************");
        Parent c2=new Child();
        c2.m1();
        c2.m2();
    }
}