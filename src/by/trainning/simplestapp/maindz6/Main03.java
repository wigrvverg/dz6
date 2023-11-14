package by.trainning.simplestapp.maindz6;

import java.util.Random;

public class Main03 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
		// четных чисел этой последовательности. Если таких чисел нет, то вывести
		// сообщение об этом факте.

		Random random = new Random();
		int length = 10;
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}

		}
	}
}
