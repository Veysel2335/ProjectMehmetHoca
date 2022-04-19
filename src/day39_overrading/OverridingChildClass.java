package day39_overrading;

public class OverridingChildClass extends OverridingParent{
    public static void mehod1(){
        System.out.println("Child class method1");
    }

    public static  void main(String[] args) {
        OverridingChildClass obj1=new OverridingChildClass();
        mehod1();
        method2();
        OverridingChildClass obj2=new OverridingChildClass();
        obj2.method2();//parent class method2
        obj2.method1();


        OverridingParent obj3=new OverridingParent();
        obj2.method2();//parent class method2
        obj2.method1();//parent class method2


    }
}
