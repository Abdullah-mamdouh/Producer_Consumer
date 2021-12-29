package Cofe;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Cofe {
	
	public static Queue <Integer> listOrder  = new LinkedList<>();
	static int lastIndex = 10;
	
	public synchronized void orderTea(int Cups) {
		listOrder.add(Cups);
		System.out.println(" Prepare "+Cups+" Tea ");
	}
	
	
   public synchronized void orderCoffee(int Cups) {
	   listOrder.add(Cups);
	   System.out.println(" Prepare "+Cups+" Coffee ");
	}
   
   public synchronized void excuteOrder() {
	   
		   System.out.println(" Order is Ready "+ listOrder.poll()+ " Cups (Coffee or Tea)");
	 
	}
   
}
