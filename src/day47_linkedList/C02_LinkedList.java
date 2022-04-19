package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //dewue ozeliklerine bakalim
        Deque<Integer>ll1=new LinkedList<>();
        ll1.addFirst(10);
        ll1.addLast(20);
        System.out.println(ll1);
        System.out.println(ll1.element());;//bastaki ilk elementi silmeden getirir
        System.out.println(ll1);

        System.out.println(  ll1.getLast());//20
        System.out.println(ll1.getFirst());//10

        ll1.offer(30);
        System.out.println(ll1);
        ll1.offerLast(40);
        ll1.offerFirst(50);
        System.out.println(ll1);

        System.out.println(ll1.peek());;//bulamaz ise null dondurur..integer doner

        ll1.poll();//hem getirir sonrada remove yapar.bulamaz ise null dondurur





    }
}
