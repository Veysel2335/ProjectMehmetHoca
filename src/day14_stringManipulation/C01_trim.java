package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        //bastaki ve sondaki tum boslkri siler

        String str="      Siz ne derseniz diyin,Java bildigini okur.     ";
        str=str.trim(); //atama yapman lazim
        System.out.println(str);//bu haliyle calisirsa bosluklari almaz .atama yapman lazim
        System.out.println(str.length());

    }
}
