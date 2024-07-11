package lambdaByJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class MyClass {
	
	public static void main(String[] args) {
		
	     List<String> students=Arrays.asList("Ram","Abhay","Eagt","Amrendra");
	     students.forEach(new MyClass()::printAll);

	  // Different ways to create streams
	     
	     //Returns a sequential Stream with this collection as its source. 
	     Stream<String> streamOfStu = students.stream();
	       
	     //Returns a sequential Stream with the specified array as its source.
	     String [] arr= {"Dayanand","Ramanand","Kalakand"};
	     Stream<String> streamOfArray = Arrays.stream(arr);
	     
	    //Returns a sequential ordered stream whose elements are the specified values
	     Stream<Integer> intStream = Stream.of(2,4,567,56,23,12);
	     
	    //Returns an infinite sequential ordered
	     Stream<Integer> iter = Stream.iterate(2, n->n+2).limit(100); 
	     
	     
	    //Returns an infinite sequential unordered stream where each element is generated 
	    //by the provided Supplier. This is suitable for generating constant streams, 
	    //streams of random elements, etc.
	     Stream.generate(()->Math.random()*100).limit(10).forEach(System.out::println); 
	     

	     
	     
	}
	private void printAll(String s) {
		System.out.println(s);
		
	}

}
