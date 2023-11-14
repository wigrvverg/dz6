package by.trainning.simplestapp.maindz6;

import java.util.Random;

public class Main05 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
		//числом. Подсчитать количество замен.
		Random random = new Random();
		int length = 10;
		int[] arr = new int[length];
int z=77;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		
			if(arr[i]>z) {
				arr[i]=z;
			
			}
			System.out.println(arr[i]);
	}

}
}