
public class GugudanArray {

	public static void main(String[] args) {
		
//		int[] result2 = new int[9];
//		for(int i=0; i < result2.length; i++) {
//			result2[i] = 2 * (i + 1);
//		}
//		
//		for (int i = 0; i < result2.length; i++) {
//			System.out.println(result2[i]);
//		}
//		
//		int[] result3 = new int[9];
//		for(int i=0; i < result3.length; i++) {
//			result3[i] = 3 * (i + 1);
//		}
//		
//		for (int i = 0; i < result3.length; i++) {
//			System.out.println(result3[i]);
//		}
		
		int[] result = new int[9];
		for(int i=2; i < 10; i++) {
			for (int j = 0; j < result.length; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);
			}
		}
	}

}
