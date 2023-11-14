package by.trainning.simplestapp.maindz6;

import java.util.Random;

public class Main10 {

	public static void main(String[] args) {
		// Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
Random random = new Random();
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
			System.out.println(arr[i]);
		if(arr[i]>i) {
		System.out.println("---"+arr[i]);
	}}}
	

}
