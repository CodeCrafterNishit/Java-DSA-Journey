package JavaCollectionFramework;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Basics{
    public static void main(String[] args) {
        //collection or list both are interface 
        //arraylist is a concrete class 
        // ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(101);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        list2.add(100);
        list2.add(101);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
        //iterator
        Iterator <Integer> iterator = list.iterator(); 
        while(iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }
        List<Integer> list3 = new ArrayList<>();
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);
        System.out.println(list3);
        System.out.println(list3.get(2));
        System.out.println(list3.get(3));
        list3.set(0,10);
        System.out.println(list3);
        Object[] arr =list3.toArray();
        for(Object obj:arr){
            System.out.println("Element : " + obj);
        }
        System.out.println(list3.contains(10));
        list.add(12);
        list.add(2);
        list.add(21);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(20);
        list4.add(30);
        list4.add(40);
        list4.add(50);
        ArrayList<Integer> newList = (ArrayList<Integer>)list4.clone();
        System.out.println(newList);
        System.out.println(newList.isEmpty());
        System.out.println(newList.indexOf(40));
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(marks.size());

        // Collection<Integer> collection = new ArrayList<>();
        }
}