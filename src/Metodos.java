
public class Metodos {
	public void rellenarArray() {
		int[] array = new int[30];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.random() * 11;
		}
		System.out.println("Hola soy isa");
	}

	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public int[] contarRepeticiones(int[] array) {
		int[] repeticiones = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			repeticiones[i] = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					repeticiones[i] += 1;
				}
			}
		}
		
		return repeticiones;
	}
}
