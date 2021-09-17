package org.test;

public class A {
  // constructor
	public A() {
    this("java");		
    System.out.println("Default constructor");
  }
    public A(int id) {
    this(99.80f);	  
	System.out.println(id);	  
  }
    public A(String name) {
    this(12);
    System.out.println(name);	  
  }
    public A(float sal) {
	System.out.println(sal);	
  	  
  }
  
  public static void main (String[] args) {
	 A a= new A();
	 
  }
} 

