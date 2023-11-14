package by.trainning.simplestapp.maindz6;

public class Main01 {

	public static void main(String[] args) {
		// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
		// кратны данному K
		int k = 3;
		int sum = 0;
		int[] arr = new int[] { 5, 7, 9, 4, 75, 21, 68, 14 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				sum += arr[i];

			}

		}
		System.out.println(sum);
	}
}
