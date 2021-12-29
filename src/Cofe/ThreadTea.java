package Cofe;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class ThreadTea extends Thread{
	
	Cofe cofe = new Cofe();
	Random random = new Random();
	@Override
	public void run() {
		int last = cofe.lastIndex;
		while(true) {
			if(cofe.listOrder.size() != last) {
				
				cofe.orderTea(ThreadLocalRandom.current().nextInt(1, 10));
				try {
					ThreadTea.sleep(500);
				} catch (InterruptedException e) {
					JOptionPane.showMessageDialog(null, e);
					e.printStackTrace();
				}
			}
			else System.out.println("Queue is Full");
		}
	}
}
