


package lambadas;

public class Threads {
	public static void main(String[] args) {
		/*
		 * Mesmo interfaces criadas antes do Java 8
		 * como a Runnable se tiver tiver a mesma assinatura
		 * de uma interface funcional pode ser utilizada 
		 * Method reference e funções lambdas
		 * */
		Runnable trabalho1 = new Trabalho1();
		
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0 ;i<10; i++) {
					System.out.println("Tarefa 2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					
				}
			}
		};
			
		Runnable trabalho3 = () -> {
				for (int i = 0 ;i<10; i++) {
					System.out.println("Tarefa 3");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
		};
		
		Runnable trabalho4 =  Threads::tarefa4;
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
			
	}
	static void tarefa4() {
		for (int i = 0 ;i<10; i++) {
			System.out.println("Tarefa 4");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}


}
