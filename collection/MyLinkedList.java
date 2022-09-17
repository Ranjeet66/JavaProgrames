package collection;

import java.util.*;


public class MyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList myLL = new MyLinkedList();
		for(int i=0; i<10;i++) {
			myLL.add(i);
		}
		
		myLL.print();
	}
}
	
//		
//    List<Integer> l1 = new LinkedList<>();
//    List<Integer> al = new ArrayList<>();
//    getTimeDiff(al);
//    getTimeDiff(l1);
//	}
//    
//    static void getTimeDiff(List<Integer> list) {
//    	
//    	long start = System.currentTimeMillis();
//    	for(int i=0; i<10000;i++) {
//    		list.add(0,1);
//    		
//    	}
//    	long end = System.currentTimeMillis();
//    	System.out.println(list.getClass().getName()+"-->"+(end - start));
//    }
////    l1.add(8);
////    l1.add(2);
////    l1.add(3);
////    l1.add(5);
////    
////    System.out.println(l1.get(1));
//
//	}


