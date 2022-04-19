package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkList {
    public static void main(String[] args) {
        LinkedList<Integer>ll1=new LinkedList<>();
        ll1.add(10);//linkedlist
        //sadece lsit interfaceinden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        //sadece deque den gelen ozellileri kullanalim
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
      ll3.addFirst(15);
        System.out.println(ll3);

    }

}
