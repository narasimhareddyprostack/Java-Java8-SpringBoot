class Demo{
    public static void main(String[] args) {
       Child c1=new Child();
       String name=c1.m1();
       double salary=c1.m2();
       boolean avail=c1.m3();
       
       System.out.println(name);
       System.out.println(salary);
       System.out.println(avail);
    }
}