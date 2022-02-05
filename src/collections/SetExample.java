package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> set1 = new HashSet<String>();// no guarantee it visible in order, example using Name1 = rohit
		
		set1.add("Name1");
		set1.add("Name2");
		set1.add("Name3");
		set1.add("Name4");
		set1.add("Name5");
		set1.add("Name6");
		set1.add("Name7");
//		set1.add("Name7");//duplicate value not taken
		
		
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Name1");
		set2.add("Name2");
		set2.add("Name3");
		set2.add("Name4");
		set2.add("Name5");
		set2.add("Name6");
		set2.add("Name7");
//		set2.add("Name7");//duplicate value not taken

	
		System.out.println(set2);
		
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Name1");
		set3.add("Name2");
		set3.add("Name5");
		set3.add("Name4");
		set3.add("Name3");
		set3.add("Name7");
		set3.add("Name6");
//		set3.add("Name6");//duplicate value not taken
		set3.add("Clean World Green World");
		// set3.add(null); we can not add null value to tree set
		System.out.println(set3);
		
//		String str1 = "Clean World Green World";
		
		Spliterator<String>spl1=set3.spliterator();
		
		
		System.out.println("Print Spliterator: ");
		spl1.forEachRemaining(System.out::println);
		
		
//		String[] split1 = str1.split(" "); 
//		System.out.println("splited: "  + split1);
	
//				int split1 = str1.length;
//		System.out.println(split1);
//		set3.add(str1);
//		System.out.println(set3);
//		Spliterator<String> spl1 =  set3.spliterator();
//		System.out.println("Splited " + spl1);
		
//		System.out.println("Splited " + set3.size());
//		System.out.println("Splited " + set3.addAll(set3));
////		System.out.println("Splited " + set3.spliterator());
	


//        // How to remove duplicate word from string
//        String str1 = "Clean World Green World";
//        HashSet<String> hs1 = new HashSet<String>();
//        for (String word : str1.split(" ")) {
//            hs1.add(word);
//        }
//        System.out.println(hs1);
//    }
         
	     
	            
	}

}
