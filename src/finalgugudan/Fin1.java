package finalgugudan;

public class Fin1 {

	public static int[] cal(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num * (i + 1);
		}
		return arr;
	}

	public static void print(int[] arr, int num) {
		System.out.println(num + "단");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n");
	}

}
