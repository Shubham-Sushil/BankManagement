package org.nextbyte;

import java.util.*;

public class CollectionsBasics {

    public static void main(String[] args) {
        CollectionsBasics c = new CollectionsBasics();
        c.demoList();
        c.demoSet();
        c.demoMap();
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

}
