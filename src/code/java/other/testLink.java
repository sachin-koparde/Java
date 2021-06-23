package code.java.other;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class testLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(7);
		ll.add(4);
		list.add(23);
		list.addLast(26);
		list.add(7);
		list.addFirst(20);
		list.add(2, 6);
		System.out.println(list);
		list.remove(3);
		list.set(1, 29);
		System.out.println(list);
		list.remove();
		System.out.println(list.contains(20));
		list.removeLast();
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		list.add(45);
		list.add(56);
		list.addFirst(89);
		list.addAll(ll);
		System.out.println(list);
		System.out.println("Index of 45 is "+list.indexOf(45));
		System.out.println("Object in the 3rd index is "+list.get(3));
	}

}
