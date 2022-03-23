package assignment9;

public class MainThread {

	public static void main(String[] args) {
		EvenNumbersThread even = new EvenNumbersThread();
		Thread t2 = new Thread(even);
		t2.start();
		OddNumbersThread odd = new OddNumbersThread();
		Thread t1 = new Thread(odd);
		t1.start();


		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
