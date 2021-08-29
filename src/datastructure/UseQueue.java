package datastructure;

import java.util.*;


public class UseQueue implements Queue {

    public static void main(String[] args) {
        Queue<String> animals = new LinkedList<>();


        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        System.out.println("LIST OF ENDANGERED ANIMALS BASED ON PRIORITY");

        animals.add("African forest elephant");
        animals.add("Amur Leopard");
        animals.add("Black Rhino");
        animals.add("Bornean Orangutan");
        animals.add("Cross River Gorilla");
        animals.add("Blue Whale");
        animals.add("Green Turtle");
        animals.add("Indian Elephant");
        animals.add("Red Panda");
        animals.add("Sea Turtle");
        animals.add("Black Spider Monkey");

        System.out.println(animals.toString());
        System.out.println();
        System.out.println("Number of Animals on this list: " + animals.size());
        System.out.println("HIGHEST LIKELY TO BE ENDANGERED IS: " + animals.element());
        System.out.println("Removing this ....");
        animals.remove();
        System.out.println("UPDATED LIST: " + animals.toString());
        System.out.println("Now showing the most likely but gonna delete: " + animals.poll());
        System.out.println("UPDATED LIST: " + animals.toString());
        System.out.println("Now highest likely is..." + animals.peek());

        Iterator<String> itr = animals.iterator();

        System.out.println();
        System.out.println("USING A FOR LOOP");
        for (String a : animals) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("USING A WHILE LOOP");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Store this in SQL


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }


    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {

        return null;
    }
}



