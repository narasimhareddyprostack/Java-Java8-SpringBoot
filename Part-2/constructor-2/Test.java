public class Test {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;
    String str;
    /* public Test(){
        super();
        this.b=0;
        this.s=0;
        this.i=0;
        this.l=0;
        this.f=0.0f;
        this.d=0.0;
        this.c=65;
        this.bl=false;
        this.str=null;
    } */
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1.i);
        System.out.println(t1.d);
        System.out.println(t1.c);
        System.out.println(t1.str);
    }
}
