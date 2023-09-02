import java.util.Scanner;

public class Interacao {
	public static void main (String [] args) {
	

		Scanner nr = new Scanner(System.in);
		System.out.print(" Digite um numero : ");
		int numeroDigitado = nr.nextInt();
		nr.close();
		if(numeroDigitado % 2 == 0) {
			System.out.print(numeroDigitado + " é par ");
		}else {
			System.out.print(numeroDigitado + " é impar ");
		}
	}
	
}
