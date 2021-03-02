
public class Area {

	public static void main(String[] args) {
		
		double ladoA = 3;
		double ladoB = 4;
		double ladoC = 5;
		
		double semiperimetro = (ladoA + ladoB + ladoC)/2;
		double perimetro = ladoA + ladoB + ladoC;
		double Area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
		
		System.out.print(Area);
		//System.out.print(perimetro);
		
		
	}

}
