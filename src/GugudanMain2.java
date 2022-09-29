import java.util.Scanner;

public class GugudanMain2 {

	public static void main(String[] args) {
		System.out.println("몇 단까지 구현하겠습니까? ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = new int[9];
		for(int i = 2; i <= first; i++) {
			for(int j = 0; j < second; j++) {
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
		}
	}

}
