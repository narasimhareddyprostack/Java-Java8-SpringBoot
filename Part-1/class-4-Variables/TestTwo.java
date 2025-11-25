class Test {
    int a=10; //Instance Variavle
    static int b=20;//static variable
    public void m1(){
        int c=30; //local variable
        System.out.println(c);
    }
    public static void main(String[] args) {
        Test t1=new Test();
        //Instance Variable  - a
        System.out.println(t1.a);
        //Static variable    - b
        System.out.println(t1.b);
        System.out.println(Test.b);
        System.out.println(b);
        //Local variable - c
        //System.out.println(c);//scope of local is with in method only
        t1.m1();
    }
}
