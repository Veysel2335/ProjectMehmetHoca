package day36_inheritance;

public class Child extends Parent {
    Child(){
        super();
        System.out.println("Child Cons calisti");
    }


    {



    }
    //tum classlarda biz gormesek de javanin olust default const vardir

    //tum constructorlarin ilk satirinda biz gormesek bile super() const call vardir.
    //yani parent classin parametresiz constructor call

    public static void main(String[] args) {
        Child child=new Child();
    }
}
