package gugudan;
public class Gugudan {

	public static int[] calculate(int num) { // 반환 타입: int 데이터 타입을 저장하는 배열
		int[] arr = new int[9];
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
