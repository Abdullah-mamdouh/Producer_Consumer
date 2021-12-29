package Producer_Consumer;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		PriorityQueue<String> n = new PriorityQueue<>();
		n.add("bbbbbbbbb");
		n.add("lllllll");
		System.out.println(n.poll());
		System.out.println(n.poll());
		System.out.println(n.poll());
		*/
		Producer produce_Tea_Coffee = new Producer();
		Consumer consumeOrder = new Consumer();
		
		produce_Tea_Coffee.start();
		consumeOrder.start();
		try {
			input.next();
			System.exit(0);
			//System.in.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
