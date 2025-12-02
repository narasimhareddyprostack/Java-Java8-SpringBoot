class GP extends Object{
    public String m1(){
        System.out.println("GP class m1 method");
        return "m1 Method";
    }
}
class Parent extends  GP{
 public double m2(){
        System.out.println("Parent class m2 method");
        return 45000.45;
    }
}
class Child extends Parent{
 public boolean m3(){
        System.out.println("Child class m3 method");
        return false;
    }
}