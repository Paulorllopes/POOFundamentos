
public class Main {

	public static void main(String[] args) {

		ClassePai cp = new ClassePai();

		// todos os m�tos do objeto "cp" s�o nativos da classePai
		// ou seja, n�o herdou nenhum m�todo de outra classe

		cp.nomePai("Jos�");
		cp.sobrenome("Lopes");
		cp.pais("Brasil");
		cp.estado("Para�ba");
		cp.cidadePai("Alagoa Nova");
		cp.idade(65);
		System.out.println("");

		ClasseFilho cf = new ClasseFilho();

		cf.nomeFilho("Paulo");// m�todo nativo da classefilho
		cf.sobrenome("Lopes");// herdado da classePai
		cf.pais("Brasil");// herdado da classePai
		cf.estadoFilho("S�o Paulo");// m�todo nativo da classefilho
		cf.cidadeFilho("S�o Paulo");// m�todo nativo da classefilho
		cp.idade(32);// O m�todo "idade" � nativo da classefilho, por�m
		// foi utilizado a anota��o "@Override" para sobrescrever o m�todo
		// idade que j� existia na classePai.
		System.out.println("");

		ClasseNeta cn = new ClasseNeta();

		cn.nomeNeta("Melissa");// m�todo nativo da classeNeta
		cn.sobrenome("Lopes");// herdado da classePai
		cn.pais("Brasil");// herdado da classePai
		cn.estadoFilho("S�o Paulo");// herdado da classefilho
		cn.cidadeFilho("S�o Paulo");// herdado da classefilho
		cn.idade(7);// O m�todo "idade" � nativo da classeNeta, por�m
		// foi utilizado a anota��o "@Override" para sobrescrever o m�todo
		// "idade" que j� existia na "classeFilho" e na classe "classePai".

	}

}
