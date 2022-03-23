package assignment9;

public class EvenNumbersThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);

		}
	}

}
