package Producer_Consumer;

import javax.swing.JOptionPane;

import Cofe.Cofe;
import Cofe.ThreadTea;

public class Consumer extends Thread {
	
	@Override
	public void run() {
		
		Cofe cofe = new Cofe();
		while(true) {
			if(!(cofe.listOrder.isEmpty())) {
				cofe.excuteOrder();
				try {
					ThreadTea.sleep(500);
				} catch (InterruptedException e) {
					JOptionPane.showMessageDialog(null, e);
					e.printStackTrace();
				}
			}
			else System.out.println("Queue is Empty");
		}
		
	}
}
