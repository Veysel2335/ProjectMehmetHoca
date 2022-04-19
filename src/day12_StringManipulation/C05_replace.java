package day12_StringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";
        //bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println(str.replace(" ","").length());
        System.out.println("orjinal str karakter sayisi:"+str.length());

        //str da kalici degisiklik yapalim
        //bugün yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","Yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra:"+str);

        str.replace("ne cok","ne az");//atama yoksa kalici degisiklikte yok
        System.out.println(str);




    }
}
