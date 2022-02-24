
public class Main {

	public static void main(String[] args) {

		ClassePai cp = new ClassePai();

		// todos os métos do objeto "cp" são nativos da classePai
		// ou seja, não herdou nenhum método de outra classe

		cp.nomePai("José");
		cp.sobrenome("Lopes");
		cp.pais("Brasil");
		cp.estado("Paraíba");
		cp.cidadePai("Alagoa Nova");
		cp.idade(65);
		System.out.println("");

		ClasseFilho cf = new ClasseFilho();

		cf.nomeFilho("Paulo");// método nativo da classefilho
		cf.sobrenome("Lopes");// herdado da classePai
		cf.pais("Brasil");// herdado da classePai
		cf.estadoFilho("São Paulo");// método nativo da classefilho
		cf.cidadeFilho("São Paulo");// método nativo da classefilho
		cp.idade(32);// O método "idade" é nativo da classefilho, porém
		// foi utilizado a anotação "@Override" para sobrescrever o método
		// idade que já existia na classePai.
		System.out.println("");

		ClasseNeta cn = new ClasseNeta();

		cn.nomeNeta("Melissa");// método nativo da classeNeta
		cn.sobrenome("Lopes");// herdado da classePai
		cn.pais("Brasil");// herdado da classePai
		cn.estadoFilho("São Paulo");// herdado da classefilho
		cn.cidadeFilho("São Paulo");// herdado da classefilho
		cn.idade(7);// O método "idade" é nativo da classeNeta, porém
		// foi utilizado a anotação "@Override" para sobrescrever o método
		// "idade" que já existia na "classeFilho" e na classe "classePai".

	}

}
