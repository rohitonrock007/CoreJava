package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generaStringthod stub

		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("Rohit");//0 index
		arraylist1.add("Sharma");//1 index
		arraylist1.add("Raj");//2 index
		arraylist1.add("Arun");//3 index
		arraylist1.add("Rohan");//4 index
		arraylist1.add("Arun");
		
		System.out.println("The Size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		System.out.println("The element at 0 index is " + arraylist1.get(0));//exact position by using "get"
		arraylist1.remove(0);
		
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		arraylist1.set(1, "Supriya");  // to replace the value at 1 position
		
		for(int index=0;index<arraylist1.size();index++) {
			
			System.out.println(arraylist1.get(index));
		}
		
		for(String name: arraylist1) {         //for each loop, different way to right for loop
			
			System.out.println(name);
		}
		
		
		//Iterator=======//for loop not supporting
		Iterator<String> itr = arraylist1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		//sorting an arraylist
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		//decending order
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);

	}

}
