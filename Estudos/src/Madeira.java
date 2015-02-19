public class Madeira {

	//atibuto da classe madeira
	String cor;
	String tipo;

	//metodos da classe madeira
	String getCor() {
		return cor;
	}

	public void setCor(String nova_cor) {
		cor = nova_cor;
	}
	
}//fim da declaração da superclasse

/*___________declaração da subclasse*___________*/

class Cadeira extends Madeira {
	
	//atributos adicionais á superclasse
	
	private int peso;
	
	//métodos adicionais a superclasse
	
	public void escreve_tela() {
		
		System.out.println(this.cor);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

}//fim da declaração da subclasse
