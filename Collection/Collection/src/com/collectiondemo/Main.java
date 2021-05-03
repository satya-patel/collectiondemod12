package com.collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		arrayList();
		stack();
		queue();
		hastSet();
		hashMap();

	}
	
	public static void arrayList() {
		
		ArrayList<String> carList = new ArrayList<String>();
		
		carList.add("BMW");
		carList.add("Audi");
		carList.add("Suzuki");
		carList.add("Volvo");
		
		for(String cars : carList) {
			System.out.println(cars);
			
		}	
		System.out.println(" ");
		
		carList.remove(2);
		
		for(String cars : carList) {
			System.out.println(cars);
			
		}	
		
		System.out.println(" ");
		
		System.out.println(carList.get(2));
	System.out.println("----------------------------------------------");
		
	}
	
	public static void stack() {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Manas");
		stack.push("Rohan");
		stack.push("Sanket");
		stack.push("Omkar");
		stack.push("Jason");
		
		Iterator itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		
		
	}
	
	public static void queue() {
		
		PriorityQueue<String> queue=new PriorityQueue<>();
		
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");
		queue.add("Five");
		
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println(" ");
		
		
		
		queue.remove();
		queue.poll();
		System.out.println("After removing");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		
	}

	public static void hastSet() {
	
		 HashSet<String> set=new HashSet();  
	     set.add("One");    
	     set.add("Two");    
	     set.add("Three");   
	     set.add("Four");  
	     set.add("Five");  	
	     Iterator<String> i=set.iterator();  
	     while(i.hasNext())  
	     {  
	     System.out.println(i.next());  
	     }  
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------");
	}

	public static void hashMap() {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(10, "OM");
		map.put(30, "Vijay");
		map.put(20, "Rahul");
		
		for(Map.Entry m:map.entrySet()) {
		    System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		System.out.println(" ");
		
		map.putIfAbsent(40, "Jason");
		for(Map.Entry m:map.entrySet()){    
	        System.out.println(" "+m.getValue());    
	       }    
	}

}
