import java.util.Scanner;

public class FilmeH {
		
	//TIRA A FOTO DESSE AQUI O OUTRO É O MEU CODIGO
	public static void main(String[] args) {
		
		String nome;
		String categoria;
		
		//Inteiros
		byte pgr;
		short duracao;
		int qtdCompartilhamento;
		long qtdVisualizacoes;
		short anoLancamento;
		
		//Decimais
		double bilheteria;
		float orcamento;
		
		//outros
		char seloQualidade;
		boolean disponivel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		nome = sc.nextLine();

		System.out.println("Informe a categoria:");
		categoria = sc.nextLine();

		System.out.println("PGR:");
		pgr = sc.nextByte();

		System.out.println("Duração:");
		duracao = sc.nextShort();
		System.out.println("Quantidade de compartilhamento:");
		qtdCompartilhamento = sc.nextInt();
		System.out.println("Quantidade de visualização:");
		qtdVisualizacoes = sc.nextLong();
		System.out.println("Ano de Lancamento:");
		anoLancamento = sc.nextShort();
		//Decimais
		System.out.println("Bilheteria:");
		bilheteria = sc.nextDouble();
		System.out.println("Orçamento:");
		orcamento = sc.nextFloat();
		
		//outros
		System.out.println("Habiliar visibilidade para usuarios:");
		disponivel = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Qual o selo de qualidade(S, A, B, C, D, E):");
		seloQualidade = sc.nextLine().charAt(0);
		sc.close();
		

		System.out.println("===================================================");
		System.out.println("Filme Cadastrado com sucesso:");
		System.out.println("Nome: " + nome);
		System.out.println("PGR:" + pgr);
		System.out.println("===================================================");
		
		
	}
}
