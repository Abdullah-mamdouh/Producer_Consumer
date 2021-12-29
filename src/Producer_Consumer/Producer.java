package Producer_Consumer;

import Cofe.ThreadCoffee;
import Cofe.ThreadTea;

public class Producer extends Thread {
		
	 @Override
	public void run() {
		ThreadTea tea = new ThreadTea();
		ThreadCoffee coffee = new ThreadCoffee();
		
		tea.start();
		coffee.start();
		try {
			Producer.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
}