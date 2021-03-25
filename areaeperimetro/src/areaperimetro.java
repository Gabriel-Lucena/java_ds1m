
import java.lang.Math;

public class areaperimetro {
	
	public static void main(String[] args) {
		
		double lado1 = Math.sqrt(2);
		double lado2 = 1;
		double lado3 = 1;
		double semiPerimetro = (lado1 + lado2 + lado3) / 2;
		
		// Não sei como fazer raiz quadrada ((
		
		double Area = Math.sqrt(semiPerimetro * 
						(semiPerimetro - lado1) * 
						(semiPerimetro - lado2) * 
						(semiPerimetro - lado3)
						)
				;
		
		double Perimetro = (lado1 + lado2 + lado3);
		
		System.out.print(Area);
		
		
	}

}
