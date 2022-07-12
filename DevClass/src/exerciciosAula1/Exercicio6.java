package exerciciosAula1;

public class Exercicio6 {
	
	public static int[] multiplos10 (int[] array) {
		int multiplo = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 10 == 0) {
				multiplo = array[i];
			} else if (array[i] % 10 != 0 && multiplo != 0) {
				array[i] = multiplo;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {1,10,11,20,12};
		
		multiplos10(array);
		
		System.out.print("{");
		for (int numero:array) {
			System.out.print(numero+",");
		}
		//fiquei com preguiça de fazer um toString bonitinho. \(¯ ▽ ¯)/ 
		System.out.println("}");
	}

}
