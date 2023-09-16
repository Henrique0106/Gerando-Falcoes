import java.util.Scanner;
public class AsksFalcaoFlix {
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
		Scanner nr = new Scanner(System.in);
		System.out.print("Digite o nome do filme : ");
		String filmeDigitado = nr.next();
		System.out.print("Digite a duração do filme : ");
		short duracaoDigitada = nr.nextShort();
		System.out.print("Digite a faixa etaria do filme : ");
		byte faixaEtaria = nr.nextByte();
		System.out.print("Digite o ator digitado do filme : ");
		String atorDigitado = nr.next();
		System.out.print("Digite a quantidade de visualizações do filme : ");
		long visualizacoesFilme = nr.nextLong();
		System.out.print("Digite a quantidade de compartilhamentos do filme : ");
		int compartilhamentoFilme = nr.nextInt();
		System.out.print("Digite o custo total do filme : ");
		double custoFilme = nr.nextDouble();
		
		nr.close();	
			System.out.print(" O nome do filme é  " + filmeDigitado);
			System.out.print(" A duração do filme é de : " + duracaoDigitada + " Minutos ");
			System.out.print(" A faixa etaria do filme é de  "+ faixaEtaria);
			System.out.print(" O ator do filme é o : " + atorDigitado);
			System.out.print(" As visualizações do filme é de : " + visualizacoesFilme);
			System.out.print(" A quantidade de compartilhamento do filme é de : " + compartilhamentoFilme);
			System.out.print(" O custo total do filme é de : " + custoFilme);
			
}
}
