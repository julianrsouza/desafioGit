package exerciciosAula1;

public class Exercicio5 {
	
	public static boolean soUmEQuatro(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 1 && array[i] != 4) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array1 = {1,4,1,4,1,4,1,4,1,4};
		int[] array2 = {1,1,1,1,1,4,4,4,4,1,1};
		int[] array3 = {1,5,6,7,8,12,44,88,99};
		
		System.out.println(soUmEQuatro(array1));
		System.out.println(soUmEQuatro(array2));
		System.out.println(soUmEQuatro(array3));
	}
}

