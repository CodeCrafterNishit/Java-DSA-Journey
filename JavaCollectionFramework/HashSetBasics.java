package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        // no duplicates in set also it can be unordered
        // HashSet
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);
        System.out.println(set1.retainAll(set2));
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));

        // LinkedHashSet
        Set<Integer> linkset1 = new LinkedHashSet<>();
        Set<Integer> linkset2 = new LinkedHashSet<>();
        linkset1.add(12);
        linkset1.add(2);
        linkset1.add(4);
        System.out.println(linkset1);
        linkset2.add(203);
        linkset2.add(74);
        linkset2.add(5);
        System.out.println(linkset2);
        System.out.println(set1.retainAll(linkset2));
        System.out.println(linkset1);
        System.out.println(set1.containsAll(linkset2));
        System.out.println(set2.containsAll(linkset2));

        //TreeSet
        Set<Integer> treeset1 = new TreeSet<>();
        treeset1.add(12);
        treeset1.add(2);
        treeset1.add(132);
        treeset1.add(124);
        System.out.println(treeset1);

    }
}
