package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class list_types {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Raju");
		list.add("Ajay");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		Iterator<String> itr2=l2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println(); 
		
		Vector<String> v=new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		Iterator<String> itr3=v.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println();
		
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.push("b");
		s.push("e");
		s.push("g");
		Iterator<String> itr4=s.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		
		System.out.println();
		
		HashSet<String> set=new HashSet<String>();
		set.add("a1");
		set.add("b2");
		set.add("a2");
		set.add("a1");
		Iterator<String> itr5=set.iterator();
		while(itr5.hasNext()) {
			System.out.println(itr5.next());
		}
	}
}
