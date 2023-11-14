package by.trainning.simplestapp.maindz6;

import java.util.Random;

public class Main08 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
		//положительных и нулевых элементов.
		Random random = new Random();
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(-100, 100);
			System.out.println(arr[i]);
		
	}
int k=0;
int o=0;
int r=0;
for (int i = 0; i < arr.length; i++) {
if (arr[i]>0) {
	k++;
}
if (arr[i]==0) {
	o++;
}
if (arr[i]<0) {
	r++;
}

	
}
System.out.println("положительных эл "+k+ " нулевых "+o+" отрицательных "+r);
}
}