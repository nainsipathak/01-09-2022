package com.oops.demo;

public class TestAuthor {
	public static void main(String[] args) 
	{
	      // Test constructor and toString()
	      Author aut1 = new Author();
	      Author aut2=new Author("Anant","Kumar");
	      Author aut3=new Author("Anant","Kumar","Ace in JAVA");
	      Author aut4=null;
	      System.out.println( "First Name:" + aut2.getFirstName());
	      System.out.println( "Last Name:" + aut2.getLastName());
	      System.out.println( "Book Name:" + aut2.getBookName());
	      System.out.println("*-*-*-*-*-*-*-*-*-*-* ");
	      System.out.println("Aut3 : " + aut3);
	      System.out.println("*-*-*-*-*-*-*-*-*-*-* ");
	      System.out.println("First Name : " + aut1.getFirstName());
	      System.out.println( "Last Name:" + aut1.getLastName());
	      System.out.println( "Book Name:" + aut1.getBookName());
	      System.out.println("*-*-*-*-*-*-*-*-*-*-* ");


	      System.out.println("Aut4 : " + aut4);
	      aut4=aut2;
	      System.out.println("Aut4 : " + aut4);


	   }
}



