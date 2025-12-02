class GP extends Object{
    public void m1(){
        System.out.println("GP class m1 method");
    }
}
class Parent extends  GP{
 public void m2(){
        System.out.println("Parent class m2 method");
    }
}
class Child extends Parent{
 public void m3(){
        System.out.println("Child class m3 method");
    }
}