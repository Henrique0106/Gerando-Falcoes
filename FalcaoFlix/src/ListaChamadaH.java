import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListaChamadaH {

		public static double somar(double numeros[]) {
		double r = 0;
		for(int i=0; i < numeros.length; i++) {
			r = r + numeros[i];	
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoLista = sc.nextInt();		
		String[] nomes = new String[tamanhoLista];
		System.out.println("Tamanho da lista:" + nomes.length);		
//		System.out.println(somar(new double[] {12,344,111}));
//		System.out.println(somar(new double[] {12,344,111, 434,566,4324,556}));
//		System.out.println(somar(new double[] {12}));
		
	}
}
