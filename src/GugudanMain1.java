import java.util.Scanner;

public class GugudanMain1 {

	public static void main(String[] args) {
		System.out.println("구구단 : ");
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		int[] result = new int[9];
		for(int i = 2; i <= inputValue; i++) {
			for(int j = 0; j < result.length; j++) {
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
		}

	}

}
