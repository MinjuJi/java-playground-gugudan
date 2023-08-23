package finalgugudan;

import java.util.Scanner;

public class Fin1App {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("n*n단(정수 n을 입력하세요) ");
		int num = kb.nextInt();

		for (int i = 2; i <= num; i++) {
			int[] arr = Fin1.cal(i);
			Fin1.print(arr, i);
		}
		kb.close();
	}

}
