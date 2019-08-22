package pacote;

public class Application {
	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorld(); 			/* objeto criado para 1ª questão */
		HelloWorld helloWorld2 = new HelloWorld(); 			/* objeto criado para 2ª questão */
		helloWorld.setNome("Gabriel"); 						/* primeira questão */
		helloWorld.printar();
		helloWorld2.printar();								/* segunda questão -- null */
		helloWorld.printarBonito(); 						/* metodo 3ª questão com 1º objeto */
		helloWorld2.setNome("Vinícius"); 					/* não é mais null, nome setado */
		helloWorld2.printarBonito(); 						/* metodo 3ª questão com 2º objeto */
	}

}
