package arquivos;

import java.util.ArrayList;

public class Matriz {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList();
		notas.add(8.9);
		notas.add(7.6);
		notas.add(5.9);
		notas.add(7.0);
		
		System.out.println(notas.get(1));
		
		int x[] = { 1, 2, 3, 4 };
		int[] y = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(x[3]);
		System.out.println(y[6]);

		System.out.println(x[2]);
		x[2] = 21;
		System.out.println(x[2]);

		String[] frutas = { "Laranja", "Banana", "Maçã", "Uva" };

		System.out.println(frutas[2]);

		frutas[4] = "Melancia";

		int i = 0;

		while (i < frutas.length) {

			System.out.println(frutas[i]);
			i++;
		}
	}

}
