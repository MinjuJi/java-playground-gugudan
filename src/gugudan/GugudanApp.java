package gugudan;
public class GugudanApp {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			int[] arr = Gugudan.calculate(i);
			Gugudan.print(arr, i);
		}
		
	}

}
