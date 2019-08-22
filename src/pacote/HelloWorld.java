package pacote;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	private String nome;

	public String getHora() {
		Date d = new Date();
		SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
		return hora.format(d);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printar() {
		System.out.println(this.getNome());
	}

	public void printarBonito() {
		System.out.println(this.getHora() + "- Olá " + this.getNome()
				+ ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}

}
