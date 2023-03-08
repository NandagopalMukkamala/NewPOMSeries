package com.qa.portal.ecps.ca.lamda;

public class TestMain {

	public static void main(String[] args) {
		
          //test((n)-> n.toUpperCase() + n.toLowerCase());
		test(n->n.toUpperCase());
		test(n->n.toLowerCase());
		
		String name = getnanda().greet("data");
		System.out.println(name);
		
		
//		StringOperations op1 = (s) -> System.out.println("My Received string:" +s);
//		op1.accept("Nanda");
		
//		StringOperations op2 = System.out::println;
//		op2.accept("Nanda");
		
		StringOperations op3 = String::toUpperCase;
	    System.out.println(op3.accept("ruthvik"));	    
		
		
	}
	
	
	
	
	
//	private static void Converttouppercase(String s) {
//		String returnedString = s.toUpperCase();
//		System.out.println(returnedString);
//	}
	
//	private static void Converttolowercase(String s) {
//		String returnedString = s.toLowerCase();
//		System.out.println(returnedString);
//	}
	
	
	private static void test(GreetingService g) {
		String returnedString = g.greet("udemy");
		System.out.println(returnedString);
	}
	
	
	private static GreetingService getnanda() {
		return (s)->s.toUpperCase();
		
	}
	
	
	
	
	
	

}
