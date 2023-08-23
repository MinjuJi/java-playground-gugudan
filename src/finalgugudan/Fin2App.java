package finalgugudan;

import java.util.Scanner;

public class Fin2App {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("n*m 단(정수 'n,m'으로 입력해주세요)");
		String inputValue = kb.nextLine();
		kb.close();
		System.out.println();

		String[] splitedValue = inputValue.split(",|\\s");

		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		int[] arr = new int[second];

		for (int i = 2; i <= first; i++) {
			System.out.println(i + "*" + second + "단");
			for (int j = 0; j < second; j++) {
				arr[j] = i * (j + 1);
				System.out.print(arr[j] + " ");
			}
			System.out.println("\n");
		}

	}

}
