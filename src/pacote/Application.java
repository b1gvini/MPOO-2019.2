package pacote;

public class Application {
	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorld(); 			/* objeto criado para 1� quest�o */
		HelloWorld helloWorld2 = new HelloWorld(); 			/* objeto criado para 2� quest�o */
		helloWorld.setNome("Gabriel"); 						/* primeira quest�o */
		helloWorld.printar();
		helloWorld2.printar();								/* segunda quest�o -- null */
		helloWorld.printarBonito(); 						/* metodo 3� quest�o com 1� objeto */
		helloWorld2.setNome("Vin�cius"); 					/* n�o � mais null, nome setado */
		helloWorld2.printarBonito(); 						/* metodo 3� quest�o com 2� objeto */
	}

}
