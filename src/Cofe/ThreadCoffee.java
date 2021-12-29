package Cofe;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class ThreadCoffee extends Thread{
	
	Cofe cofe = new Cofe();
	Random random = new Random();
	@Override
	public void run() {
		int last = cofe.lastIndex;
		while(true) {
			if(cofe.listOrder.size() != last) {
				cofe.orderCoffee(ThreadLocalRandom.current().nextInt(1, 10));
				
				try {
					ThreadCoffee.sleep(500);
				} catch (InterruptedException e) {
					JOptionPane.showMessageDialog(null, e);
					e.printStackTrace();
				}
			}
			else System.out.println("Queue is Full");
		}
	}
}