package by.trainning.simplestapp.maindz6;
import java.util.Random;
public class Main02 {

	public static void main(String[] args) {
		// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное
		Random random = new Random();
		 int length = 10;
	        int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(-100,100);
			System.out.println(arr[i]);
		}
			if(arr[0]>0) {
				System.out.println("Первый эллемент в массиве положительный");
			}
			else {
				System.out.println("Первый эллемент в массиве отрицательный");
			}
		}
		
	
		
}

