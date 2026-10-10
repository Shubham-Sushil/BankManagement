package org.nextbyte;

import java.util.*;

public class CollectionsBasics {

    public static void main(String[] args) {
        CollectionsBasics c = new CollectionsBasics();
        //c.demoList();
        c.demoSet();
        //c.demoMap();
    }

    public void demoList(){

        List l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(3);
        l.add(0);
        l.add(8);
        l.add(5);
        l.add(3);
        l.add(10);

        System.out.println(l);

        printCollections(l);

    }

    public void demoSet(){

        Set s = new TreeSet();
        s.add(2);
        s.add(5);
        s.add(3);
        s.add(0);
        s.add(8);
        s.add(5);
        s.add(3);
        s.add(10);

        System.out.println(s);
        printCollections(s);

    }

    public void demoMap(){

        Map map = new LinkedHashMap();
        map.put(3, "AIML");
        map.put(5, "AME");
        map.put(1, "CSE");
        map.put(2, "EEE");
        map.put(4, "IT");


        System.out.println(map);

    }

    public void printCollections(Collection l){
        System.out.println("Printing Collections manually");
        System.out.println("For Loop");
        /*for (int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }*/
        System.out.println("For each Loop");
        for(Object i: l){
            System.out.println(i);
        }

        System.out.println("Iterator print");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            Object i = itr.next();
            System.out.println(i);
        }

    }



}
