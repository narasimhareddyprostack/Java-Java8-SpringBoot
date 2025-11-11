class Test {
    int a;          //default Value 0
    int b=10;      
    static int c=20;
    int[] eids=new int[4];
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        //How to access static variable c
        System.out.println(c);          //directly in static concext
        System.out.println(t1.c);       //using object name
        System.out.println(Test.c);     //using class Name
    }
}
