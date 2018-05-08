package Exercicio1;

public class Incremental {

	/**
	 * 
	 * @author Bruno Gabriel RA 816111491 - SI3AN-MCA
	 *  
	 *
	 */
	
	private static final Object lock = new Object();

	private static Incremental singletonInstance;

	private static int count = 0;

	private int numero;

	private Incremental() {
		numero = ++count;
	}

	public static Incremental getInstance() {
		synchronized (lock) {
			if (singletonInstance == null)
				singletonInstance = new Incremental();
		}

		return singletonInstance;
	}

	public String toString() {
		return "Incremental " + numero;
	}

	public static class TesteIncremental {
		public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				Incremental inc = new Incremental();
				System.out.println(inc);
			}
		}
	}
}
