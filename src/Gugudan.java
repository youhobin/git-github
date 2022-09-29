import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		if(number < 2) {
			System.out.println("2보다 큰 값을 입력해주세요");
		} else if(number > 9 ) {
			System.out.println(" 9보다 작은 값을 입력해주세요");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
		
		
	}

}
