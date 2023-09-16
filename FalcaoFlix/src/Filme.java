
public class Filme {
	// Cadastrar filme:: Nome , duracao , categorias, autor , ano , faixaEtaria
	// Nome: Matrix
	//Duracao: 2h16m17s; 2:16 => Minutos/Segundos
	//Duracao: 180 m
	//faixaEtaria: 0, 10, 12, 14, 16, 18
	//views: 1_000_000_000
	//compartilhamento: 1_000
	//custo;300.000,15
	//disponivel: false/true
	public static void main(String[] args) {
	// Atributos, Caracteristicas , variavel
		String nome;
		byte faixaEtaria;
		short duracao;
		int quantidadeCompartilhamento;
		long quantidadeVisualizacoes;
		boolean disponivel;
		double custo;
		float variavelFloat;
		char variavelChar;
		
		System.out.println("Byte: ");
		System.out.println("MIN: " + Byte.MIN_VALUE);
		System.out.println("MIN: " + Byte.MAX_VALUE);
		
		System.out.println("Short: ");
		System.out.println("MIN: " + Short.MIN_VALUE);
		System.out.println("MIN: " + Short.MAX_VALUE);
		
		System.out.println("Int : ");
		System.out.println("MIN: " + Integer.MIN_VALUE);
		System.out.println("MIN: " + Integer.MAX_VALUE);
		
		System.out.println("Long: ");
		System.out.println("MIN: " + Long.MIN_VALUE);
		System.out.println("MIN: " + Long.MAX_VALUE);
		
		
		System.out.println("Float");
		System.out.println("MIN: " + Float.MIN_VALUE);
		System.out.println("MIN: " + Float.MAX_VALUE);
		
		
		System.out.println("Double: ");
		System.out.println("MIN: " + Double.MIN_VALUE);
		System.out.println("MIN: " + Double.MAX_VALUE);
		
		char varChar = 76;
		
		System.out.println("Char: ");
		System.out.println("Valor: " + varChar);
		System.out.println("===========================");
	}
}

