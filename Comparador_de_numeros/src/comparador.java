import java.util.Scanner;

public class comparador {

	public static void main(String[] args) {
	
    int PrimeiroNumero;
    int SegundoNumero;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Comparador de valores");
    System.out.print("Digite o primeiro nÃºmero:");
    PrimeiroNumero = leitor.nextInt();
    System.out.print("Digite o segundo número:");
    SegundoNumero = leitor.nextInt();

    if (PrimeiroNumero < SegundoNumero){
        System.out.print(PrimeiroNumero + " Ã© menor do que " + SegundoNumero);} 
    else if (PrimeiroNumero > SegundoNumero){
        System.out.print(PrimeiroNumero + " Ã© maior do que " + SegundoNumero);}
    else {
    	System.out.print(PrimeiroNumero + " é igual ao " + SegundoNumero);
    }
	
	
}
}
