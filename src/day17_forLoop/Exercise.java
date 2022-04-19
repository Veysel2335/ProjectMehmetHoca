package day17_forLoop;

public class Exercise {
    public static void main(String[] args) {
        //put * between 2 consecutive characters and to the end in a string
        String s="Java";
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i)+"*");

        }
        System.out.println("2.soru");
        //type code to print unique characters in a string .hello==>heo
        String  t="Hello";
        for (int i = 0; i <t.length() ; i++) {
            if (t.indexOf(t.charAt(i))==t.lastIndexOf(t.charAt(i))){
                System.out.print(t.charAt(i ));
            }

            }

        }


    }

