
public class GugudanClass {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			int[] result = GugudanMethod.calculate(i);
			GugudanMethod.print(result);
		}

	}

}
