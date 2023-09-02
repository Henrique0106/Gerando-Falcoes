import java.util.Scanner;

public class Triangulo {
	public static void main (String [] args) {
		
		Scanner nr = new Scanner(System.in);
		System.out.print("Digite a area e o comprimento");
		int areaDigitada = nr.nextInt();
		int comprimentoDigitado = nr.nextInt();
		int baseDigitada = areaDigitada * comprimentoDigitado / 2;
		nr.close();
			System.out.print("A area do triangulo é de " + baseDigitada);
	}
}
