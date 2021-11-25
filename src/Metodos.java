
public class Metodos {
	public void rellenarArray() {
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.random() * 11;
		}
	}
}
