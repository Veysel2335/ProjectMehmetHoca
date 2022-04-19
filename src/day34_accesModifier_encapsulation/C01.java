package day34_accesModifier_encapsulation;

public class C01 {
   private static int sayi=10;
   private static String str="Java";
   static int acikSayi=20;//access modieferi defalut access modofier
   String acikString="Hi";//access modieferi defalut access modofier
   public static int halkaAcikSayi=15;
   protected static int aileyeOzel=40;
  protected C01(){
//bu const access modifieri default access modieferdir
      //dolayisiyla icinde oldugumuz paketin disinda bu classdan obje olsturulamaz

   }
   private C01(int numara){
      System.out.println("parametreli Const calisti");

   }
   private void method1(){

   }

    }

