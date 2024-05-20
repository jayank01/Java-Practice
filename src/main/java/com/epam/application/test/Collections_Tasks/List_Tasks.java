package com.epam.application.test.Collections_Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Club{
    ArrayList<String> member;
    public Club() {
        member = new ArrayList<>();
    }
    public void addMembers( String name ) {
        member.add(name);
    }
    public void deleteMembers( String name ){
        member.remove(name);
    }
    public void listAllMembers() {
        for( String mem : member ) System.out.println( mem );
    }
    public boolean searchMembers( String name ) {
        return member.contains(name);
    }
    public void updateMembers( String oldName, String newName ) {
        int idx = member.indexOf(oldName);
        member.set(idx, newName);
    }
    public void sortMembers() {
        Collections.sort( member );
    }
}
public class List_Tasks {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);

        // Task 1:
        // 1. trim in list
        System.out.println("Initial size: " + l.size());
        l.trimToSize();
        System.out.println("Size after trimming: " + l.size());

        // 2. replace occurrences of a specified element in an array list with another element
        l.set(0,l.get(0)+2);

        l.add(3);

        // 3. duplicate elements in a list.
        HashSet<Integer> set = new HashSet<>();
        for( int ele : l ) {
            if( !set.contains(ele) )  {
                set.add( ele );
            }else {
                System.out.println("Duplicate element: " + ele);
            }
        }

        // 4. compares two lists of integers
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(3);
        l2.add(4);
        ArrayList<Integer> ans = new ArrayList<>(l2);
        for( int ele : l1 ) {
            if(ans.contains(ele) ) {
                int index = ans.indexOf(ele);
                ans.remove(index);
            }else {
                ans.add(ele);
            }
        }

        // 5. convert a List to a Set and a Set to a List
        HashSet<Integer> s = new HashSet<>(l);
        ArrayList<Integer> a = new ArrayList<>(set);

        // 6.
        int position = 1;
        ans = new ArrayList<>();
        for( int i = position ; i < l1.size() ; i++ ) {
            ans.add(l1.get(i));
        }
        for (int i = 0 ; i < position ; i++ ) ans.add(l1.get(i));

        // Task 2:
        Club c = new Club();
        c.addMembers("arsh");
        c.addMembers("arya");
        c.addMembers("jayank");
        c.addMembers("chhatraj");
        c.deleteMembers("jayank");
        c.listAllMembers();
        System.out.println( c.searchMembers("chhatraj") );
        c.updateMembers("chhatraj", "jayank");
        c.sortMembers();

        // Task 3:
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);
        a2.add(5);
        a2.add(6);
        System.out.println( compare(a1, a2) );
        System.out.println( join(a1, a2) );
        clone(a1, a2);
    }
    public static boolean compare( ArrayList<Integer> a1, ArrayList<Integer> a2 ) {
        if( a1.equals(a2) ) return true;
        return false;
    }
    public static ArrayList<Integer> join( ArrayList<Integer> a1, ArrayList<Integer> a2 ) {
        ArrayList<Integer> a3 = new ArrayList<>(a1);
        for( int ele : a2 ) a3.add(ele);
        return a3;
    }
    public static void clone( ArrayList<Integer> a1, ArrayList<Integer> a2 ) {
        a2 = new ArrayList<>(a1);
    }
}
