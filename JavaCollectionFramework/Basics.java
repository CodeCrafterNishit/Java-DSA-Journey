package JavaCollectionFramework;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
 
//List -> ArrayList LinkedList Vector Stack

public class Basics {
    public static void main(String[] args) {
        // collection or list both are interface
        // arraylist is a concrete class
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
        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
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
        list3.set(0, 10);
        System.out.println(list3);
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
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
        ArrayList<Integer> newList = (ArrayList<Integer>) list4.clone();
        System.out.println(newList);
        System.out.println(newList.isEmpty());
        System.out.println(newList.indexOf(40));
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(marks.size());

        // Collection<Integer> collection = new ArrayList<>();

        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(100);
        ll.add(101);
        System.out.println(ll);
        list.addAll(ll);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.removeAll(ll);
        System.out.println(list);
        ll.add(100);
        ll.add(101);
        System.out.println(ll.size());
        System.out.println(ll);
        list2.clear();
        System.out.println(ll);
        // iterator
        Iterator<Integer> iterator1 = ll.iterator();
        while (iterator1.hasNext()) {
            System.out.println("Element : " + iterator1.next());
        }
        ll.addFirst(99);
        ll.addLast(98);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println("----------");
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll);

        System.out.println(ll.offer(101));
        System.out.println(ll);

        //Vectors
        // Vector
        System.out.println("----Vectors----");
        Vector<Integer> vec = new Vector<>();
        vec.add(100);
        vec.add(101);
        System.out.println(vec);

        // Assuming list is another collection
        List<Integer> lst = new ArrayList<>();
        lst.addAll(vec);
        System.out.println(lst);

        lst.remove(1); // removes element at index 4
        System.out.println(lst);

        lst.removeAll(vec); // removes all elements present in vec
        System.out.println(lst);

        vec.add(100);
        vec.add(101);
        System.out.println(vec.size());
        System.out.println(vec);

        List<Integer> lst2 = new ArrayList<>();
        lst2.clear();
        System.out.println(vec);

        // iterator
        Iterator<Integer> iterator_1 = vec.iterator();
        while (iterator_1.hasNext()) {
            System.out.println("Element : " + iterator_1.next());
        }

        // Vector doesn’t have addFirst/addLast, so we use insert at index
        vec.insertElementAt(99, 0); // add at beginning
        vec.add(98); // add at end
        System.out.println(vec);

        System.out.println(vec.firstElement()); // get first
        System.out.println(vec.lastElement());  // get last

        //Stacks
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(11);
        stk.push(12);
        stk.push(13);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.search(12));
        System.out.println(stk.empty());
    }
}